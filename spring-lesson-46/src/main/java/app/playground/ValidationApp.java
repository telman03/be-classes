package app.playground;

public class ValidationApp {


    /* age validation:
    * x >= 0
    * x <= 100
    * ...
    * */

    public static Object validate(Integer x){
        if(x < 0) return "age should be non negative";
        if(x > 100) return "age should be less than 100";
        return true;
    }

    public static void main(String[] args) {

    }
}
