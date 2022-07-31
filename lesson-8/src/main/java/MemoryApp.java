
class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static String format = "My name is %s";
}

public class MemoryApp {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        String user1 = "Alex";
        String user2 = "Jim";
        String user3 = "Alex";
        String user4 = new String("Alex");

        int x = 5;
        Integer y = 5;
        Cat cat = new Cat("Jacky", 15);
        Cat cat2 = new Cat("Mickey", 15);
        String format = Cat.format;
        String format1 = Cat.format;
        String format2 = Cat.format;
    }

}
