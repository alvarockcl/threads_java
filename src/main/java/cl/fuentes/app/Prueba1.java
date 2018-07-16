package cl.fuentes.app;

/* INTERFACE RUNNABLE
    public interface Runnable {
        public abstract void run();
    }
*/
public class Prueba1 implements Runnable{

    private Thread hebra =  null;
    private int contador = 0;
    private String nombreHebra;

    public Prueba1(String nomheb){
        nombreHebra = nomheb;
    }

	public void run() {
        while(true){
            System.out.println("La hebra : " + nombreHebra + " conteo : " + contador );
            contador++;
        }
    }

    public void start(){
        if(hebra == null){
            hebra = new Thread(this);
            hebra.start();
            System.out.println("Hebra " + nombreHebra + " iniciada");
        }
    }

    public void stop(){
        if(hebra!=null){
            hebra.stop();
            hebra=null;
            System.out.println("Hebra " + nombreHebra + " finalizada");
        }
    }
}