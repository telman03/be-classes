package app;

public class Point2D {
    Integer x;
    Integer y;

    public Point2D(Integer x) {
        this.x = x;
    }

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }



    public Point2D() {
    }

    @Override
    public String toString() {
        return String.format("[%d:%d]", x, y);
    }

    public void printMe(){
        System.out.println("---");
        System.out.println(this);
        System.out.println("---");
    }
}

