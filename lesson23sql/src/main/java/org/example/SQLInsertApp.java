package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLInsertApp {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/be5",
                "postgres",
                "eden258"
        );
        PreparedStatement st = conn.prepareStatement("insert into person(id, name) values (?, ?)");

        st.setInt(1,41);
        st.setString(2, "Alexander I");
        st.execute();


        st.setInt(1,42);
        st.setString(2, "Alexander II");
        st.execute();
    }

}
