package Patrones.Mediator;
//main
public class Prueba {
    public static void main(String[] args){
        Usuario karla = new Usuario("Karla");
        Usuario oscar = new Usuario("Oscar");

        karla.mensajeEnviado("Hola Oscar");
        oscar.mensajeEnviado("Hola Karla");
        
    }    
}
