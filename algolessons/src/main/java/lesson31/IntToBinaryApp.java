package lesson31;

public class IntToBinaryApp {
    static void decimalToBinary(int num){
        System.out.println(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
        int num = 128;
        decimalToBinary(num);
    }
}
