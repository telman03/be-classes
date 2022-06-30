package org.example;
import java.util.Random;
public class loopsApp {
    public static void main(String[] args){
//        Random rd = new Random();
//        for(int i = 0; i < 10; i++){
//           System.out.println(rd.nextInt(7));
////
//
//        }
        int i = 0;
        while(i < 10) {
            System.out.println(i + " Hi");
            i++;
            if(i == 5){
                break;
            }
        }

    }
}
