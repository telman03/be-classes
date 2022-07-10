package org.example;

public class Envelope {
    public static void main(String[] args) {
        int height = 10;
        int width = 25;
        double tan = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if(
                        row == firstRow ||
                        row *tan== col ||
                        row*tan + col == width - 1 ||
                        col == firstCol ||
                        col == lastCol ||
                        row == lastRow)
                {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
