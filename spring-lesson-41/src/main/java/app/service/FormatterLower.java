package app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // WAY #2
public class FormatterLower implements Formatter {
    @Override
    public String format(String origin) {
        return origin.toLowerCase();
    }
}
