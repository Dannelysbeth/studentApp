package com.dannelysbeth.mongorestfullapi.model;

import com.dannelysbeth.mongorestfullapi.model.enums.Gender;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favSubjects;
    private BigDecimal totalSpentBooks;
    private LocalDateTime created;

    @Builder
    public Student(String firstName,
                   String lastName,
                   String email,
                   Gender gender,
                   Address address,
                   List<String> favSubjects,
                   BigDecimal totalSpentBooks,
                   LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favSubjects = favSubjects;
        this.totalSpentBooks = totalSpentBooks;
        this.created = created;
    }
}
