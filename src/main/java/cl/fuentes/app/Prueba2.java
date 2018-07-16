package cl.fuentes.app;

public class Prueba2 implements Runnable{

    private Thread hebra=null;
    private boolean running=true;
    private int contador = 0;
    private String nombreHebra;
    
    public Prueba2(String nomheb){
        nombreHebra = nomheb;
    }
    
    public void run() {
		while(running == true){
            proceso();
        }
    }

    public void iniciar(){
        if(hebra == null || !running){
            hebra = new Thread(this);
            hebra.start();
            System.out.println("Hebra " + nombreHebra + " iniciada");
        }
    }

    public void parar(){
        running=false;
        System.out.println("Hebra " + nombreHebra + " finalizada");
    }

    public void proceso(){
        try{
            System.out.println("La hebra : " + nombreHebra + " conteo : " + contador );
            contador++;
        }catch (Exception e) { }
    }
}