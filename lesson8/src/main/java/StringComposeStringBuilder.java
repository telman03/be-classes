public class StringComposeStringBuilder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();

        String s = "";
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }
}
