package tema_04;

public class Animal {
    
    private String tipoDeAnimal; // solo dentro de la clas
    private byte edad;
    public String nombre; // desde cualquier clase
    public String propietario;
    protected String estado; // dentro de la clase y clases hijos
    protected int codigo;
    String comentario; // dentro del paquete
    
    public Animal(){
        
    }
    
    public Animal(String tipoDeAnimal, String propietario, int codigo){
        this.tipoDeAnimal = tipoDeAnimal;
        this.propietario = propietario;
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(byte edad){
        this.edad = edad;
    }
    
    public byte getEdad(){
        return this.edad;
    }
    
    public void jugar(){
        if ( this.nombre!=null ) {
            System.out.println("El " + this.tipoDeAnimal + " se llama " + this.nombre);
        } else {
            System.out.println("El " + this.tipoDeAnimal + " no tiene nombre ");
        }
    }
    
}
