package cl.fuentes.app;

// java -cp target/threads_java-1.jar cl.fuentes.app.App
// java -cp target/threads_java-1.jar cl.fuentes.otro.EjemploHilo

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Prueba1 prueba1 = new Prueba1("Hebra 1");
        prueba1.start();
        Prueba2 prueba2 = new Prueba2("Hebra 2");
        prueba2.iniciar();        
        
        Thread.sleep(50); // a los 50 milisegundos detiene la primera
        prueba1.stop();
        Thread.sleep(100); // luego a los 100 milisegundos detiene la segunda
        prueba2.parar();
        
    }
}
