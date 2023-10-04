package com.dannelysbeth.mongorestfullapi.auth;

import com.dannelysbeth.mongorestfullapi.model.enums.Gender;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegisterRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String studentNumber;
    private Gender gender;

    public RegisterRequest getRegisterRequest(){
        return RegisterRequest.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .username(username)
                .password(password)
                .build();
    }
}


