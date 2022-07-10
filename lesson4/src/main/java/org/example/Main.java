package org.example;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int j = 8; j > 0; j--){
            for(int k = 0 ;k < j ; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}