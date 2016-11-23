package graf_02;

import javax.swing.JFrame;

public class ClaseJFrameCentrado {

    public static void main(String[] args) {
        
        VentanaCentrada ventana = new VentanaCentrada();
        
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.imprimirDimensiones();
        
    }
    
}
