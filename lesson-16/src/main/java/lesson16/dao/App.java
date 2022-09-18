package lesson16.dao;

import java.io.File;

public class App {

    public static <A> void soSomething(DAO<A> dao){
        /// ...
    }

    public static void main(String[] args) {
        Person p = new Person();
        Pizza pz = new Pizza();
        Student s = new Student();

        DAO<Person> daoPersonInMemory = new DaoPersonInMemory();
        daoPersonInMemory.save(p);
        Person p1 = daoPersonInMemory.load(123);

        DAO<Person> daoPersonFile = new DaoPersonFile(new File("persons.bin"));
        daoPersonFile.save(p);
        Person p2 = daoPersonFile.load(123);

        soSomething(daoPersonInMemory);
        soSomething(daoPersonFile);

        DaoPizzaInMemory daoPizzaInMemory1 = new DaoPizzaInMemory();
        DaoPizza daoPizzaInMemory2 = new DaoPizzaInMemory();
        DAO<Pizza> daoPizzaInMemory3 = new DaoPizzaInMemory();

    }
}
