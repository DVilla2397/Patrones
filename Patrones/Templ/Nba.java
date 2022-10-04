package Patrones.Templ;


//juego nba
public class Nba extends AllStar {
    @Override
    void finalizar(){
        System.out.println("Termino el juego de la NBA");
    }

    @Override
    void comenzar(){
        System.out.println("Comenzo el juego de la NBA");
    }

    @Override
    void iniciar(){
        System.out.println("Da inicio el juego de la NBA");
    }
}
