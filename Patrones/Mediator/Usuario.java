package Patrones.Mediator;

public class Usuario {

    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void mensajeEnviado(String mensaje){
        Conversacion.mensajeRecibido(this, mensaje);
    }
    
}
