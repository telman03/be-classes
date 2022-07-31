public class PassApp {

    int x = 10;
    public int add(int a, int b){
        return a + b + x;
    }

    public static void main(String[] args) {
        PassApp app = new PassApp();
        int x = app.add(1,2);
        System.out.println(x);
    }
}
