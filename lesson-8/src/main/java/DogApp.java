class Dog {
    String name;
    private static int count = 0;
    public Dog(String name) {
        this.name = name;
        count ++;
    }
    public static int getCount() {
        return count;
    }
}

public class DogApp {

    public static void main(String[] args) {
        Dog d1 = new Dog("Tax");
        Dog d2 = new Dog("Chappy");
        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(Dog.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Dog.getCount());

    }
}
