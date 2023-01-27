package app.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDetailsServiceJPA  implements UserDetailsService {

    private final DbUserRepo repo;

    public static UserDetails mapper(DbUser dbUser) {
        return User
                .withUsername(dbUser.getUsername())
                .password(dbUser.getPassword())
                // password stored in the DB already encoded, we don't need to deal with encoding
                .roles()
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return repo.findByUsername(username)
                .map(UserDetailsServiceJPA::mapper)
                .orElseThrow(() ->new UsernameNotFoundException(
                        String.format("User '%s' not found", username)
                ));
    }
}
