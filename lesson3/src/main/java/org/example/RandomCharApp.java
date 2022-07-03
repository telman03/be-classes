package org.example;
import java.util.Random;
import java.util.Scanner;
public class RandomCharApp {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0; i < num; i++){
            char ch = (char) rnd.nextInt((122 - 97 + 1) + 97);
            if(ch == 'a' || ch == 'i')break;
            System.out.println(ch);
        }
    }
}