package tema_08;

public class Competencia{

    public static void main(String[] args) {
        
        Cronometro c1 = new Cronometro("Gemerson");        
        Cronometro c2 = new Cronometro("Henry");
        // c1.iniciarCronometro();
        // c2.iniciarCronometro();
        
        //comienzaHilo();
        
    }
    
    /*public static void comienzaHilo(){
               
        Cronometro c1 = new Cronometro("Gemerson");
        crearHilo(c1);
        
        Cronometro c2 = new Cronometro("Henry");
        crearHilo(c2);
        
    }
    
    public static void crearHilo(Cronometro c){
        Runnable r = new CronometroHilos(c);
        Thread t = new Thread(r);        
        t.start();
    }*/
}
