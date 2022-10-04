package Patrones.Templ;

//juego mls
public class Mls extends AllStar {
    
    @Override
    void finalizar(){
        System.out.println("Termino el juego de la MLS");
    }

    @Override
    void comenzar(){
        System.out.println("Comenzo el juego de la MLS");
    }

    @Override
    void iniciar(){
        System.out.println("Da inicio el juego de la MLS");
    }
}
