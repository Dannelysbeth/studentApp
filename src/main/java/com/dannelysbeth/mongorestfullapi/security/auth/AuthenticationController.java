package com.dannelysbeth.mongorestfullapi.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @RequestMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(RegisterRequest request){
      return ResponseEntity.ok(authenticationService.register(request));
    }

    @RequestMapping("/login")
    public ResponseEntity<AuthenticationResponse> authentication(AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request));

    }
}
