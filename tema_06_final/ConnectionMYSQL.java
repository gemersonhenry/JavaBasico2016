package tema_06;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {

    private static Connection conn = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:33066/demo_java", "root", "");
                /*
                "localhost" es la dirección donde debe estar alojado la base de datos.
                "33066" es el puerto de conexión hacia la base de datos, por defecto en todas las bases de datos
                es el 3306.
                Si la configuración del puerto está por defecto no es necesarió ponerlo.
                "root" es el usuario con permisos de acceso a la BBDD y "" es la contraseña que en este caso
                no tiene, osea vacio.
                */
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return conn;
    }

    public static void cerrar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
