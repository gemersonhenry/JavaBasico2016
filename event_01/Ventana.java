package event_01;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(String title){
        
        Toolkit ventana = Toolkit.getDefaultToolkit();
        Dimension pantalla = ventana.getScreenSize();
                
        setVisible(true);
        setSize(pantalla.width/2, pantalla.height/2);
        setLocation(pantalla.width/4, pantalla.height/4);
        setTitle(title);
        
        LaminaBotones lamina = new LaminaBotones();
        
        add(lamina);
        
    }
    
}
