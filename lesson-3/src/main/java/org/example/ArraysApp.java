package org.example;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args){
        int[] arr1;
        int []arr3;

        String []str = new String[10];
        byte[] arrByte = {51,23,3,4,35};

        Arrays.sort(arrByte);

        for (int el : arrByte) {
            System.out.println(el);
        }
    }
}
