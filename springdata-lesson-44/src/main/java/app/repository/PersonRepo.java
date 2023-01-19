package app.repository;


import app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
    List<Person> findAllByAgeBetweenAndUsernameContaining(int age1, int age2, String part);
}