package graf_04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class Lamina extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        //g.drawRect(50, 50, 50, 50);
        //g.drawLine(100, 100, 300, 100);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 100);
        // PINTANDO CONTORNO DE LA FIGURA
        g2.draw(rectangulo);
        // PINTANDO FONDO DE LA FIGURA
        g2.setPaint(Color.BLUE);
        g2.fill(rectangulo);
        
        
        Ellipse2D elipse = new Ellipse2D.Double();
        // PINTANDO EL CONTORNO DE LA FIGURA
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        // PINTANDO EL FONDO DE LA FIGURA
        g2.setPaint(Color.GREEN);
        g2.fill(elipse);
        
        /*g2.draw(new Line2D.Double(100, 100, 300, 200));
        
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 100;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2.draw(circulo);*/
    } 
    
}
