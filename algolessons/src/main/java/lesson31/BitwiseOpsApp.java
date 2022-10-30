package lesson31;

public class BitwiseOpsApp {
    public static void main(String[] args) {
        int x = 1 & 4; // 0
        int y = 1 | 4; // 5
        byte z = ~4; // -5

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
