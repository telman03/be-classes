package task;

public class Triple<A, B, C> {
    A a;
    B b;
    C c;

    public Triple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static <A, B, C> Triple<A, B, C> of(A a, B b, C c) {
        return new Triple<>(a, b, c);
    }

}

