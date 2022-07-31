package task;



// public            - visible everywhere
// [package private] - visible to all in package `lesson6`
// protected         - visible for extending classes
// private           - visible only for the instance

    class Apple {
        public String name;
        public int size;
        public double weight;
    }

    class Person {
        String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeOlder(int delta) {
            this.age += delta;
        }
    }

    class Teacher extends Person {

        public Teacher(String name, int age) {
            super(name, age);
        }

        public void doSome() {
            String name1 = this.name;
            int age1 = this.age;
        }


    }

    public class VisibilityApp {
        public static void main(String[] args) {
            Apple a = new Apple();
            String name = a.name;
            int size = a.size;
            double weight = a.weight;

            Person jim = new Person("Jim", 33);
//    jim.age = 50; // meaningless
            jim.makeOlder(5);
        }


}
