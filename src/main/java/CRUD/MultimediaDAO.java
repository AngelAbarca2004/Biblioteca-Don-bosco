/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import static Connection.DBConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Carlo
 */
public class MultimediaDAO {

    public List<Map<String, Object>> obtenerInfoPrestamos(int Filtro) {
        List<Map<String, Object>> resultados = new ArrayList<>();
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(
                "SELECT CODIGO,TITULO,ARTISTA,GENERO,DURACION,NUMERO_DE_CANCIONES,UNIDADES_DISPONIBLES,DIRECTOR,ID_MULTIMEDIA,ID_ESTADO FROM CD_DVD WHERE ID_MULTIMEDIA=?")) {
            stmt.setInt(1, Filtro);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> fila = new HashMap<>();
                    fila.put("CODIGO", rs.getString("CODIGO"));
                    fila.put("TITULO", rs.getString("TITULO"));
                    fila.put("ARTISTA", rs.getString("ARTISTA"));
                    fila.put("GENERO", rs.getString("GENERO"));
                    fila.put("DURACION", rs.getString("DURACION"));
                    fila.put("NUMERO_DE_CANCIONES", rs.getString("NUMERO_DE_CANCIONES"));
                    fila.put("UNIDADES_DISPONIBLES", rs.getString("UNIDADES_DISPONIBLES"));
                    fila.put("DIRECTOR", rs.getString("DIRECTOR"));
                    fila.put("ID_MULTIMEDIA", rs.getString("ID_MULTIMEDIA"));
                    fila.put("ID_ESTADO", rs.getString("ID_ESTADO"));
                    resultados.add(fila);
                }
            }
        } catch (Exception ex) {
            // Manejar excepción
            System.out.print("ERROR: " + ex);
        }
        return resultados;
    }
}
