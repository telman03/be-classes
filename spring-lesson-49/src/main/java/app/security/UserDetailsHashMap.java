package app.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class UserDetailsHashMap {
    private final Map<String, String> storage = new HashMap<>();

    public UserDetailsHashMap(){
        storage.put("jim", "123");
        storage.put("john", "234");
    }

    private UserDetails mapper(Map.Entry<String, String> entry){
        return User
                .withDefaultPasswordEncoder()
                .username(entry.getKey())
                .password(entry.getValue())
                .roles()
                .build();
    }

    @Bean
    public UserDetailsService uds(){
        return new InMemoryUserDetailsManager(
                storage.entrySet().stream()
                        .map(this::mapper)
                        .collect(Collectors.toSet())
        );
    }
}
