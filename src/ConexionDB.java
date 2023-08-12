
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class ConexionDB {

    private final String url;
    private final String usuario;
    private final String contrasena;

    public ConexionDB() {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.usuario = "MEGATRON";
        this.contrasena = "123";
    }

    // Método para establecer la conexión
    public Connection establecerConexion() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
        return connection;
    }
}
