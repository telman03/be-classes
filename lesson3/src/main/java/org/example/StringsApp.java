package org.example;


public class StringsApp {
    public static void main(String[] args) {
//        char[] chars = {'S', 't', 'r'};
//        String str = new String(chars);
//        System.out.println(str);

        String str1 = "Ibatech";
        String str2 = "Ibatech";
        String str3 = new String("Ibatech");
        String str4 = new String("Ibatech");
        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); //false
        System.out.println(str1.equals(str3));  // true
        System.out.println(str3 == str4); //false

        System.out.println(str3 + "or");

        System.out.println(str1);

        StringBuffer sBuff = new StringBuffer("String");
        StringBuilder sBuild = new StringBuilder();

        sBuff.append("val");
        System.out.println(sBuff);

        System.out.print(String.format("%12.12f", 32.45));
    }
}
