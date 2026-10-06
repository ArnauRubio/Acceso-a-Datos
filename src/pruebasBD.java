import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class pruebasBD {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/ejemplo"; //"jdbc:mariadb://localhost:3306/mi_app"
        String usuario = System.getenv("MARIADB_USER");
        String contrasena = System.getenv("MARIADB_PASSWORD");

        if (usuario == null || contrasena == null) {
            throw new IllegalStateException(
                    "Define MARIADB_USER y MARIADB_PASSWORD en la configuración de ejecución de IntelliJ."
            );
        }

        try (Connection conexion =
                     DriverManager.getConnection(url, usuario, contrasena)) {
            System.out.println("Conexión a MariaDB correcta");
        }
    }
}