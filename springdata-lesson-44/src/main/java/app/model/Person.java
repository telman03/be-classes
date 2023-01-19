package app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

//@Table(name = "person1") //table name
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id1")
    private Integer id;
//    @Column(name = "username1")
    private String username;

//    @Column(name = "password1")
    private String password;

    private Integer age;

    private Boolean checked;

}

