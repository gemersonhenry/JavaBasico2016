package graf_03;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    private int alto;
    private int ancho;
    
    public Ventana(String title){
        
        Toolkit ventana = Toolkit.getDefaultToolkit();
        Dimension pantalla = ventana.getScreenSize();
        
        this.alto = pantalla.height;
        this.ancho = pantalla.width;
        
        setVisible(true);
        setSize(this.ancho/2, this.alto/2);
        setLocation(this.ancho/4, this.alto/4);
        setTitle(title);
        
        Lamina lamina = new Lamina();
        
        add(lamina);
        
    }
    
}
