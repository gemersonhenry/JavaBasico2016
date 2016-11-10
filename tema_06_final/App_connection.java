package tema_06;

import java.sql.SQLException;

public class App_connection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        // CONEXIÓN A BASES DE DATOS
        System.out.println(ConnectionMYSQL.obtener());
        
        /*
        No se necesita instanciar un objeto de la clase ConnectionMYSQL para acceder al metodo "obtener"
        por que este método se definio como STATIC.
        */
        
    }
    
}
