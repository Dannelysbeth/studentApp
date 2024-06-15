package com.dannelysbeth.mongorestfullapi.model;

import com.dannelysbeth.mongorestfullapi.model.enums.Gender;
import com.dannelysbeth.mongorestfullapi.model.enums.Role;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Document
public class User implements UserDetails {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    private Set<Role> roles;
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
    public User(String username,
                String password,
                Set<Role> roles,
                String firstName,
                String lastName,
                String email,
                Gender gender,
                Address address,
                List<String> favSubjects,
                BigDecimal totalSpentBooks,
                LocalDateTime created) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favSubjects = favSubjects;
        this.totalSpentBooks = totalSpentBooks;
        this.created = created;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
