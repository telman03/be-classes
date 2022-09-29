package sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLApp {
    public static void main(String[] args)  {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/abb",
                    "postgres",
                    "eden258"
            );
        }catch (Exception e){
            e.getMessage();
        }
    }
}