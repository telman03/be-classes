package org.example;
import java.util.Scanner;


public class FaceControlApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How old are your: ");
        int age = in.nextInt();

        String result = (age > 18) ?  "OK" : "Not OK";
    }
}
