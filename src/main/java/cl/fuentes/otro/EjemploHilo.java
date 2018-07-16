package cl.fuentes.otro;

public class EjemploHilo {

    static int contador=0;
    
    public static void main(String[] args) {
        Proceso miproceso = new Proceso(){
            public void run(){
                while(!terminarHilo){
                    System.out.println("Ejecutando hilo : " + contador);
                    contador++;
                }
            }
        };
        Thread mihilo = new Thread(miproceso);
        mihilo.start();
            try { 
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
        }
        miproceso.setterminarHilo(true);
    }
}
