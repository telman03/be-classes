package org.example;

public class SwitchApp {
    public static void main(String[] args){
        int i = 10;
//        System.out.println(i == 2 ? "OK" : i == 10 ? "ten" : "NOT OK");
        switch (i) {
            case 10:
                System.out.println("one");
            case 2:
                System.out.println("two"); break;
            default:
                System.out.println("def");


        }
    }
}
