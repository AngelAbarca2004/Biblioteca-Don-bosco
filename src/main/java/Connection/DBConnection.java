package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            // Establecer la conexión
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MEDIATECA", "root", "");
        }
        return connection;
    }
}