package tema_08;

public class Cronometro {
    
    private int tiempo = 0;
    private String nombre;

    public Cronometro() {
    }

    public Cronometro(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirCronometro(){
        System.out.println("Tiempo de " + this.nombre + ": " + this.tiempo);
        aumentarTiempo();
    }
    
    public void aumentarTiempo(){
        this.tiempo = this.tiempo + 1;
    }
    
    /*public void iniciarCronometro() throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            imprimirCronometro();
            try {
                Thread.sleep(1000);                 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    
                       
        }
    }*/
}
