package com.dannelysbeth.mongorestfullapi.auth;

import com.dannelysbeth.mongorestfullapi.exception.EmailExistsException;
import com.dannelysbeth.mongorestfullapi.exception.IncorrectPasswordException;
import com.dannelysbeth.mongorestfullapi.exception.UsernameNotFoundException;
import com.dannelysbeth.mongorestfullapi.model.User;
import com.dannelysbeth.mongorestfullapi.repository.UserRepository;
import com.dannelysbeth.mongorestfullapi.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

import static com.dannelysbeth.mongorestfullapi.model.enums.Role.ROLE_USER;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        if (repository.existsByEmail(request.getEmail())) {
            throw new EmailExistsException();
        }
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .roles(Set.of(ROLE_USER))
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        var user = repository.getUserByUsername(request.getUsername())
                .orElseThrow(UsernameNotFoundException::new);

        boolean decoded = passwordEncoder.matches(request.getPassword(), user.getPassword());
        if(!decoded) {
            throw new IncorrectPasswordException();
        }

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
