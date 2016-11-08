package tema_04;

public class Animal {
    
    private String tipoDeAnimal;
    private byte edad;
    public String nombre;
    public String propietario;
    protected String estado;
    protected int codigo;
    String comentario;
    
    public Animal(){
        
    }
    
    public Animal(String tipoDeAnimal, String propietario, int codigo){
        this.tipoDeAnimal = tipoDeAnimal;
        this.propietario = propietario;
        this.codigo = codigo;
    }
    
    private void setNombre(String nombre){
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
