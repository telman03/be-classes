package app.model.ui;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
public class Author {

    private Integer id;


    private String name;



}
