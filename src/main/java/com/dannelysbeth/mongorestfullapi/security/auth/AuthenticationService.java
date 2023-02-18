package com.dannelysbeth.mongorestfullapi.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse register(RegisterRequest registerRequest){
        return null;
    }
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest){
        return null;
    }
}
