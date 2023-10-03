package com.dannelysbeth.mongorestfullapi.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String email;
    protected String password;
}

