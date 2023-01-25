package app.ex;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorPayload {

    String className;
    String payload;

    String url;
}

