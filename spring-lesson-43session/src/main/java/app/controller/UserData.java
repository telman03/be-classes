package app.controller;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserData {
    public final static String keyName = "data";

    private String language; // EN/US/AZ
    private Integer screen;  // 800 / 1024 / 1920

    public static UserData make() {
        return new UserData("EN", 1024);
    }

}

