package com.dannelysbeth.mongorestfullapi.security;

import com.dannelysbeth.mongorestfullapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class AppConfig {
    private final UserRepository userRepository;
    @Bean           //bean should always be public
    public UserDetailsService userDetailsService(){
        //lambda
        return username -> userRepository
                .getUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(""));
    }
}
