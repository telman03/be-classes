package lesson30;

import java.util.Arrays;
import java.util.Comparator;

public class SortApp {

    public static void main0(String[] args) {
        Integer[] arr = {5,62,12,56,22,1, 55, 99};
//    System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sortJalal(arr)));

    }

    public static Integer[] sort(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    /**
     * sort algorithm ...................
     * the best case complexity is: O(n)
     * the worst case complexity is: O(n^2)
     */
    public static Integer[] sortJalal(Integer[] arr){
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
        return arr;
    }

    public static void merge1(int[] data, int indexLeft, int indexMiddle, int indexRight) {
        int[] leftArray = Arrays.copyOfRange(data, indexLeft, indexMiddle );
        int[] rightArray = Arrays.copyOfRange(data, indexMiddle, indexRight  );

        if(leftArray.length > 0 && rightArray.length > 0 ){

            int pointer1 = 0;
            int pointer2 = 0;
            int i = indexLeft;

            while(i < indexRight  ) {

                if( pointer2 == rightArray.length || (pointer1 < leftArray.length && leftArray[pointer1] < rightArray[pointer2])){
                    data[i] = leftArray[pointer1];
                    pointer1++;
                }
                else if ( pointer1 == leftArray.length || pointer2 < rightArray.length){
                    data[i] = rightArray[pointer2];
                    pointer2++;
                }
                i++;
            }
        }

    }


    // starting point
    public static int[] merge0exp(int[] data1, int[] data2) {
        int[] data3 = new int[data1.length + data2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < data1.length && j < data2.length)
            data3[k++] = (data1[i] < data2[j]) ? data1[i++] : data2[j++];

        while (i < data1.length)
            data3[k++] = data1[i++];

        while (j < data2.length)
            data3[k++] = data2[j++];

        return data3;
    }

    public static int[] merge0(int[] data1, int[] data2) {
        int[] data3 = new int[data1.length + data2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < data1.length && j < data2.length)
            data3[k++] = (data1[i] < data2[j]) ? data1[i++] : data2[j++];

        // optimisation
        if (i < data1.length) System.arraycopy(data1, i, data3, k, data1.length - i);
        if (j < data2.length) System.arraycopy(data2, j, data3, k, data2.length - j);

        return data3;
    }

    public static void main(String[] args) {
        int[] as = {1,3,5,7};
        int[] bs = {2,3,4,10,100};
        int[] cs = merge0(as, bs);
        System.out.println(Arrays.toString(as));
        System.out.println(Arrays.toString(bs));
        System.out.println(Arrays.toString(cs));
    }

    public static void merge(int[] data, int indexLeft, int indexMiddle, int indexRight) {
        throw new IllegalArgumentException("not implemented");
    }

    public static void split(int[] a, int l, int r) {
        if (l < r) { // still have a data
            int mid = (l + r) / 2;
            split(a, l, mid);
            split(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public static void mergeSort(int[] a) {
        split(a, 0, a.length);
    }

    class Pizza implements Comparable<Pizza> {
        int size;

        @Override
        public int compareTo(Pizza o) {
            return 0;
        }
    }

    final class Person {
        int age;
        String name;
    }


    // we need somehow to provide functionality to compare
    // this for cases we can modify our entities
    public static <A extends Comparable<A>> void sortWhatever1(A[] data) {
        // .............

//    if(data[1] < data[2]) {}
        if (data[1].compareTo(data[2]) < 0) {}
        // .............
    }

    // we need somehow to provide functionality to compare
    // this for cases we can NOT modify our entities
    // even more: you can provide different comparator.
    public static <A> void sortWhatever2(A[] data, Comparator<A> cmp) {
        // .............

//    if(data[1] < data[2]) {}
        if (cmp.compare(data[1], data[2]) < 0) {}
        // .............
    }


}
