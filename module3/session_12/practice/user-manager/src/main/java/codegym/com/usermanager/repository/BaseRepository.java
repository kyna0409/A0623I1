package codegym.com.usermanager.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseRepository {
    private String jdbcURL ="jdbc:mysql://localhost:3306/demo1";
    private String jdbcUsername ="root";
    private String jdbcPassword ="Thuhoa040902";
    public Connection getConnection()
    {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (Exception e) {
            System.err.print("Can't connect to MySQL");
        }
        return connection;
    }
}
