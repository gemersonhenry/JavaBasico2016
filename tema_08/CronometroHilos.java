package tema_08;

public class CronometroHilos implements Runnable{
    
    private Cronometro cronometro;
    
    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            this.cronometro.imprimirCronometro();
            try {
                Thread.sleep(1000);                 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    
                       
        }
        
    }

    public CronometroHilos(Cronometro cronometro) {
        this.cronometro = cronometro;
    }
    
}
