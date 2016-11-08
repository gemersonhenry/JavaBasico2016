package tema_05;

public class Alumnos {
    
    private final String[] alumnos;

    public Alumnos(int n) {
        this.alumnos = new String[n];
    }
    
    public void setAlumno(int i, String alumno){
        this.alumnos[i] = alumno;
    }
    
    public String getAlumnos(int i){
        return this.alumnos[i];
    }
    
    public int getLengthAlumnos(){
        return this.alumnos.length;
    }
    
    public String[] getTodos(){
        return this.alumnos;
    }
}
