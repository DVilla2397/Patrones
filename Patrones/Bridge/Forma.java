package Patrones.Bridge;

//Creacion forma 
public abstract class Forma {
    protected Puente puente;

    protected Forma(Puente puente){
        this.puente = puente;
    }
    public abstract void dibujar();
    
}
