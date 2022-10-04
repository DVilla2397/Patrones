package Patrones.Mediator;
import java.util.Date;

//Sala de chat

public class Conversacion {
    public static void mensajeRecibido(Usuario usuario, String mensaje){
        System.out.println(new Date().toString() + " [" + usuario.getNombre() + "] : " + mensaje);
    }
}
