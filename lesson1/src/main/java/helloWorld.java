import java.io.PrintStream;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args){

        System.out.println();
        PrintStream out = System.out;
        out.println();
        Scanner sn = new Scanner(System.in);
        out.println("Enter your name");
        String myName = sn.nextLine();
        out.println("Enter your age");
        int myAge = sn.nextInt();
        out.println("Hello, "+ myName);
        out.println("Your age is, "+ myAge);
    }
}