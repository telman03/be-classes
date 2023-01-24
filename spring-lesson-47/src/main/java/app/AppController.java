package app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class AppController {

    private final AppService appService;

    // http://localhost:8080/1
    @GetMapping("1")
    public ResponseEntity<?> handle1(){
        return appService.doSomething().map(x -> ResponseEntity.ok(x))
                .orElse(ResponseEntity.status(500).build());
    }


    // http://localhost:8080/2
    @GetMapping("2")
    public ResponseEntity<?> handle2(){
        try {
            return ResponseEntity.ok(appService.doSomething2());
        } catch (Exception ex){
            return ResponseEntity.status(500).build();
        }

    }
}
