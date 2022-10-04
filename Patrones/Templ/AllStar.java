package Patrones.Templ;

//Template
public abstract class AllStar {
    abstract void comenzar();
    abstract void iniciar();
    abstract void finalizar();

    public final void juego(){

        comenzar();

        iniciar();

        finalizar();
    }
}
