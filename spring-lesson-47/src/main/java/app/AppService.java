package app;

import app.ex.LoginError;
import app.ex.PasswordError;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.Optional;


@Service
public class AppService {
    
    public Optional<String> doSomething(){
        try {
            if (true) throw new IllegalArgumentException("boom!");
        } catch (Exception ex){
            return Optional.empty();
        }
        return Optional.of("Fine");
    }
    public String doSomething2(){
        if (true) throw new IllegalArgumentException("boom!");
        return "Fine";
    }
    public String doSomething3(int x, int y){
        return String.format("%d / %d = %d", x ,y, x / y);
    }


    public String doSomething4(){
        throw new LoginError("jim");
    }

    public String doSomething5(){
        throw new PasswordError("qwerty12345");
    }

}
