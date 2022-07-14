package org.example;

public class DoubleEnvelope {
    public static String makeEnvelope(int width, int height) {
        /** logic / process */
        double k = (double) width / height;
        final int firstRow = 0;
        final int secondRow = firstRow + 1;
        final int firstCol = 0;
        final int secondCol = firstCol + 1;
        final int lastRow = height - 1;
        final int lastRow1  = height -2;
        final int lastCol = width - 1;
        final int lastCol1  = width -2;

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == firstRow ||                   // firstRow
                        col == firstCol ||                   // firstCol
                        col == lastCol ||                    // lastCol
                        row == lastRow ||                    // lastRow
                        col == Math.round(row * k) ||        // diagonal 1
                        col == lastCol - Math.round(row * k) || col == secondCol ||
                        row == secondRow || col == lastCol1 || row == lastRow1// diagonal 2
                )
                    sb.append("*");
                else
                    sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /** input data */
        int height = 11;
        int width = 22;

        /** call the business logic extracted and decoupled from input and output */
        String result = makeEnvelope(width, height);

        /** output result */
        System.out.println(result);
    }

}
