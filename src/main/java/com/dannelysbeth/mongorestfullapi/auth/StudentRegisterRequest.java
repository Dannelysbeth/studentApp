package com.dannelysbeth.mongorestfullapi.auth;

import com.dannelysbeth.mongorestfullapi.model.enums.Gender;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegisterRequest extends RegisterRequest{
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String studentNumber;
    private Gender gender;
}
