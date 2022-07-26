
public class NaiveStringBuilder {

    private String[] data = new String[100];
    private int pointer;

    public void append(String s) {
        data[pointer++] = s;
    }


    @Override
    public String toString() {

        int len = 0;
        for (int i = 0; i < data.length; i++) {
            len += data[i].length();
        }

        char[] composed = new char[len];

        return new String(composed);
    }
}


