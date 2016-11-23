package graf_03;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Lamina extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.drawString("HOLA MUNDO", 10, 10);
    }
        
}
