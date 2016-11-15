package tema_07;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excepciones {

    public static void main(String[] args) throws IOException {
        
        // PRIMER EJEMPLO
        int[] mi_arreglo = new int[5];        
        mi_arreglo[0] = 16;
        mi_arreglo[1] = 20;
        mi_arreglo[2] = 34;
        mi_arreglo[3] = 12;
        mi_arreglo[4] = 78;
        //mi_arreglo[5] = 45; //error de la clase ArrayIndexOutOfBoundsException  
        //por asignación a indice no existente       
        /*for (int i = 0; i < mi_arreglo.length; i++) {
            System.out.println("Posición "+i+": "+mi_arreglo[i]);
        }*/
        
        // SEGUNDO EJEMPLO
        /*String[] mi_segundo_arreglo = new String[3];        
        for (int i = 0; i < mi_segundo_arreglo.length; i++) {
            mi_segundo_arreglo[i] = JOptionPane.showInputDialog("Ingrese un nombre: ");
        }        
        // Si a un string le ingreso un número, se convierte en string en tiempo de ejecución
        for (int i = 0; i < mi_segundo_arreglo.length; i++) {
            System.out.println("Posición "+i+": "+mi_segundo_arreglo[i].length());
        }*/
        
        // TERCER EJEMPLO
        /*int[] ultimo_arreglo = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ultimo_arreglo.length; i++) {
            System.out.println("Ingrese un número: ");
            ultimo_arreglo[i] = sc.nextInt();
        } 
        for (int i = 0; i < ultimo_arreglo.length; i++) {
            System.out.println("Posición "+i+": "+ultimo_arreglo[i]);
            // error de clase InputMismatchException por ingreso de tipo de valor erroneo
        }*/
        
        // CUARTO EJEMPLO
        GetImage mi_imagen = new GetImage();
        mi_imagen.getImagen("src/imagenes/autos.jpg");
        // si no encuentra la imagen lanza la clase IIOException
        mi_imagen.detalleImagen();
                
    }
    
}
