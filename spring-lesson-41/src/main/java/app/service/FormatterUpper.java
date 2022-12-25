package app.service;

import org.springframework.stereotype.Service;

@Service
public class FormatterUpper implements Formatter {
    @Override
    public String format(String origin) {
        return origin.toUpperCase();
    }
}
