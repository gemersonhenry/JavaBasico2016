package tema_06;

import java.sql.SQLException;

public class App_connection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        // CONEXIÓN A BASES DE DATOS
        System.out.println(ConnectionMYSQL.obtener());
        
    }
    
}
