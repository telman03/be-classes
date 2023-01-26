package app.security;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Configuration
@RequiredArgsConstructor
public class UserDetailsJPA {

    private final DbUserRepo repo;


//    private final PasswordEncoder enc;
//
//    public UserDetailsJPA(PasswordEncoder enc){
//        this.enc = enc;
//        storage.put("jim", "123");
//        storage.put("john", "234");
//    }

    private UserDetails mapper(DbUser dbUser){
        return User
                .withUsername(dbUser.getUsername())
                .password(dbUser.getPassword()) // password already stored in db encoded
//                .passwordEncoder(x -> enc.encode(x))
                .roles()
                .build();
    }

    @Bean
    public UserDetailsService uds(){
        return new InMemoryUserDetailsManager(
                StreamSupport.stream(repo.findAll().spliterator(), false)
                        .map(this::mapper)
                        .collect(Collectors.toSet())
        );
    }
}
