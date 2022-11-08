package lesson32;


public class ArraySum {

    static int sum1(int[] x) {
        if (x.length == 0) return 0;
        else {
            int[] tail = new int[x.length-1];
            System.arraycopy(x, 1, tail, 0, x.length-1);
            return x[0] + sum1(tail);
        }
    }

    private static int sum2(int[] x, int pos) {
        if (pos == x.length) return 0;
        else return x[pos] + sum2(x, pos+1);
    }

    static int sum2(int[] x) {
        return sum2(x, 0);
    }

    private static int sum3(int[] x, int pos, int ac) {
        if (pos == x.length) return ac;
        else return sum3(x, pos+1, x[pos] + ac);
    }

    static int sum3(int[] x) {
        return sum3(x, 0, 0);
        //             index,  sum
    }

    public static void main(String[] args) {
        int[] a = {1, 10, 100}; // 111
        System.out.println(sum1(a));
        System.out.println(sum2(a));
        System.out.println(sum3(a));
    }
}
