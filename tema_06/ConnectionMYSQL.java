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
