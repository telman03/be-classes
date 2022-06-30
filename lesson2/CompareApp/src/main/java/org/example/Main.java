package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        /*
        == equal
        > more
        < less
        => more equal
        <= less equal
        != not equal
        */
        if(a < b){
            System.out.println("a more than b");
        }
        if(a == b){
            System.out.println("a");
        }else{
            System.out.println("b");
        }

        System.out.println("Hello world!");
    }
}