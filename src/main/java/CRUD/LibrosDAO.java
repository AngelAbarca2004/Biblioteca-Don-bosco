/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CRUD;

import Connection.DBConnection;
import clases.Libros_Revistas;
import static Connection.DBConnection.getConnection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Carlo
 */
public class LibrosDAO {

    public List<Map<String, Object>> obtenerInfoPrestamos(int Filtro) {
        List<Map<String, Object>> resultados = new ArrayList<>();
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(
                "SELECT CODIGO_LIBRO,AUTOR,TITULO,FECHA_DE_PUBLICACION,EDITORIAL,ISBN,UNIDADES_DISPONIBLES,PERIODICIDAD,NUMERO_DE_PAGINAS,ID_CATEGORIA_ESCRITOS,ID_ESTADO FROM LIBRO_REVISTAS WHERE ID_CATEGORIA_ESCRITOS=? AND ID_ESTADO=1")) {
            stmt.setInt(1, Filtro);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> fila = new HashMap<>();
                    fila.put("AUTOR", rs.getString("AUTOR"));
                    fila.put("TITULO", rs.getString("TITULO"));
                    fila.put("FECHA_DE_PUBLICACION", rs.getString("FECHA_DE_PUBLICACION"));
                    fila.put("EDITORIAL", rs.getString("EDITORIAL"));
                    fila.put("ISBN", rs.getString("ISBN"));
                    fila.put("UNIDADES_DISPONIBLES", rs.getString("UNIDADES_DISPONIBLES"));
                    
                    fila.put("PERIODICIDAD", rs.getString("PERIODICIDAD"));
                    fila.put("NUMERO_DE_PAGINAS", rs.getString("NUMERO_DE_PAGINAS"));
                    resultados.add(fila);
                }
                conn.close();
            }
        } catch (Exception ex) {
            // Manejar excepción
            System.out.print("ERROR: "+ex);
        }
        return resultados;
    }
}