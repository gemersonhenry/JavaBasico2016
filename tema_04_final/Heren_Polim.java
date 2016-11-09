package tema_04;

public class Heren_Polim {

    public static void main(String[] args) {
        
        /*
        PRACTICA DE CLASE
        */
        
        
        Animal animal = new Animal();
        animal.jugar();
        System.out.println("Nombre del animal: " + animal.nombre);
        animal.setNombre("Charlie");
        animal.jugar();
        System.out.println("Nombre del animal: " + animal.nombre);
        
        
        // ANALIZANDO
        
        Perro perro = new Perro("Pastor aleman", "Henry", 666666);
        perro.setNombre("Firulais");
        
        // El nombre del perro está vacío, y no se puede asignar un nombre
        System.out.println("El propietario de " + perro.getNombre() + " es " + perro.propietario);
        perro.jugar();
        
        Gato gato = new Gato();
        gato.setEdad((byte)2);
        
        // Haremos jugar al gato
        gato.jugar();
        System.out.println("La edad del gato es " + gato.getEdad() + " años ");
        
    }
    
}
