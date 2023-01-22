package app.model.db;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "b_id")
    private Long id;

    @Column(name = "b_title")
    private String title;


    @JsonBackReference
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

}
