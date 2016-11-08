package tema_04;

public class Heren_Polim {

    public static void main(String[] args) {
        
        Perro perro = new Perro("Pastor aleman", "Henry", 666666);
        //perro.setNombre();
        
        // El nombre del perro está vacío, y no se puede asignar un nombre
        System.out.println("El propietario del " + perro.getNombre() + " es " + perro.propietario);
        perro.jugar();
        
        Gato gato = new Gato();
        //gato.setEdad(2);
        
        // Haremos jugar al gato
        gato.jugar();
        System.out.println("La edad del gato es " + gato.getEdad() + " años ");
        
    }
    
}
