package app.model.ui;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
public class Book {
    private Long id;

    private String title;

    private Set<Author> authors;

}
