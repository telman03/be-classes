package app.security;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Arrays;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("jim")
                .password("123")
                .roles()
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("john")
                .password("234")
                .roles()
                .build();

        return new InMemoryUserDetailsManager(Arrays.asList(user1, user2));
    }
}
