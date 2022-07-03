package org.example;

import java.util.Arrays;

public class CopyArrayApp {
    public static void main(String[] args){

        int[] arrOne = {1,2,3};
        int[] arrTwo = new int[arrOne.length * 2];

        Arrays.fill(arrTwo, 5);

        System.arraycopy(arrOne, 0, arrTwo, 0, arrOne.length);

//        arrTwo[4] = 1;

//        System.out.println(arrTwo.length);

        for (int el : arrTwo) {
            System.out.println(el);
        }

    }
}

