package graf_02;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class VentanaCentrada extends JFrame{
    
    private int alto;
    private int ancho;
    
    public VentanaCentrada(){
        
        Toolkit pantalla = Toolkit.getDefaultToolkit();        
        Dimension ventana = pantalla.getScreenSize();
        
        this.alto = ventana.height;
        this.ancho = ventana.width;

        setSize(this.ancho/2, this.alto/2);
        setLocation(this.ancho/4, this.alto/4);
    }
    
    public void imprimirDimensiones(){
        System.out.println("Alto: "+this.alto);
        System.out.println("Ancho: "+this.ancho);
    }
    
}
