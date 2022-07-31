package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne = in.nextInt();
        int numberTwo = 3;
        int result = numberOne - numberTwo;
        int mult = numberOne * numberTwo;
        System.out.println(result);
        System.out.println(mult);
    }
}