import CRUD.LibrosDAO;
import CRUD.MultimediaDAO;
import java.util.List;
import java.util.Map;

public class TestObtenerInfoPrestamos {
    public static void main(String[] args) {
       MultimediaDAO test= new MultimediaDAO();
        List<Map<String, Object>> resultados = test.obtenerInfoPrestamos(1);
        
        // Verificar los resultados
        for (Map<String, Object> fila : resultados) {
            System.out.println("CODIGO: " + fila.get("CODIGO"));
            System.out.println("Título: " + fila.get("TITULO"));
            System.out.println();
        }
    }

    public List<Map<String, Object>> obtenerInfoPrestamos(int Filtro) {
        // Aquí iría el código de tu método obtenerInfoPrestamos()
        // ...
        return null;
    }
}