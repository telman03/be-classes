package app.security;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class CreateUsersOnce {
    private final DbUserRepo repo;
    private final PasswordEncoder enc;

    public void create(){
        repo.saveAll(Arrays.asList(
                new DbUser(null,"jim", enc.encode("123")),
                new DbUser(null,"john", enc.encode("234"))
        ));
    }

}
