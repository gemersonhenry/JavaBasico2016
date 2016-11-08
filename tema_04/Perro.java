package tema_04;

public class Perro extends Animal{
    
    public Perro(String tipoDeAnimal, String propietario, int codigo){
        super(tipoDeAnimal, propietario, codigo);
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setEdad(int edad){
        //this.edad = edad;
    }
}
