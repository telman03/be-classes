package lesson31;


public class BitwiseOpsApp {

    public static void main0(String[] args) {
        int x = 1 & 4; //  0
        int y = 1 | 4; //  5
        byte z = ~4;   // -5

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main1(String[] args) {
        byte x = (byte) (127 + 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a = 0b0111; // 7
        int b = 0b0001; // 1
        // 0111
        // 0001
        // 0110
        int c = a ^ b; // 6
        System.out.println(c);
    }

}

