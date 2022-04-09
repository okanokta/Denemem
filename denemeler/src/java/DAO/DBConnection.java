package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author oktao
 */
public abstract class DBConnection {

    public Connection connect() {
        Connection c = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/spor", "postgres", "12345");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return c;
    }

}
