package app.encoding;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

public class EncodingApp {
    public static void main(String[] args) {
        String plain = "123";
        Pbkdf2PasswordEncoder enc = new Pbkdf2PasswordEncoder();
        String encoded = enc.encode(plain);
        System.out.println(encoded);

        boolean matches  = enc.matches(plain, encoded);
        //  entered, encoded  from db
        System.out.println(matches);
    }
}
