package app;

import org.springframework.stereotype.Service;

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
}
