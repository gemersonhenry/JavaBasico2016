package event_01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaBotones extends JPanel{

    JButton botonAzul = new JButton("Azul");
    /*JButton botonRojo = new JButton("Rojo");
    JButton botonGris = new JButton("Gris");*/
    
    public LaminaBotones(){        
        add(botonAzul);
        //botonAzul.addActionListener(this);
        /*add(botonRojo);
        botonRojo.addActionListener(this);
        add(botonGris);
        botonGris.addActionListener(this);*/
    }

    //@Override
    //public void actionPerformed(ActionEvent e) {
        
        
        
        /*String color = e.getActionCommand();
        if (null != color) switch (color) {
            case "Azul":
                setBackground(Color.BLUE);
                break;
            case "Rojo":
                setBackground(Color.RED);
                break;
            case "Gris":
                setBackground(Color.GRAY);
                break;
            default:
                setBackground(Color.WHITE);
                break;
        }*/
        
        /*Object botonPulsado = e.getSource();
        if ( botonPulsado==botonAzul ) {
            setBackground(Color.BLUE);
        }else if ( botonPulsado==botonRojo) {
            setBackground(Color.RED);
        }else if ( botonPulsado==botonGris) {
            setBackground(Color.GRAY);
        }*/
        
    //}
    
}
