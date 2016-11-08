package tema_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estruct_de_datos {

    public static void main(String[] args){
        
        // CREANDO UN ARREGLO (VECTOR) MEDIANTE UNA CLASE
        Alumnos alumnos = new Alumnos(2);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < alumnos.getLengthAlumnos(); i++) {
            System.out.println("Ingrese un nombre:");
            String nombre = sc.nextLine();
            alumnos.setAlumno(i, nombre);
        }        
        System.out.println("Cantidad de estudiantes: " + alumnos.getTodos().length);
        
        System.out.println("------------------------------");
        
        // CREANDO UN ARREGLO DIRECTAMENTE
        String[] animales = new String[4];
        animales[0] = "Caballo";
        animales[1] = "Zorro";
        animales[2] = "Tiburón";
        animales[3] = "Tortuga";
        System.out.println("El arreglo tiene " + animales.length + "  ");
        
        System.out.println("------------------------------");
        
        // LISTA DE PRODUCTOS Y SUS PRECIOS
        List<Productos> productos = new ArrayList<>();        
        Productos p01 = new Productos("Zapato", 115.9);        
        productos.add(p01);
        System.out.println("Número de productos en lista: " + productos.size());
        
        System.out.println("------------------------------");
        
               
    }
    
}
