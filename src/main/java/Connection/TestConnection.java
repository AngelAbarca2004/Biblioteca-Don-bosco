package Connection;

import java.sql.*;

public class TestConnection {

    public static void main(String[] args) {
        try {
            
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Establecer la conexión
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MEDIATECA", "root", "");

            // Mostrar mensaje de éxito
            System.out.println("Conexión exitosa a la base de datos.");

            // Cerrar la conexión
            connection.close();
           

        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}