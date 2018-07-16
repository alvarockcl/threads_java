package cl.fuentes.otro;

public class Proceso implements Runnable{
    boolean terminarHilo=false;
    
    public void run() {
    }
    public boolean getterminarHilo(){
        return terminarHilo;
    }
    public void setterminarHilo(boolean parar){
        this.terminarHilo = parar;
    }
}
