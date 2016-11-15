package tema_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class TrabajandoFiles {

    public static void main(String[] args) throws FileNotFoundException {

        // File: LECTURA
        File file = new File("src/files/prueba_01.txt");
        Scanner s = null;

        System.out.println("----- Empezamos lectura -----");

        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Mensage: " + e.getMessage());
        } finally {
            if (s != null) {
                s.close();
            }
        }        

        //FileWriter: ESCRITURA
         
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("src/files/prueba_02.txt");            
            String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete"};
            for (String linea : lineas) {
                fichero.write(linea + "\n\n");
            }
            fichero.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
