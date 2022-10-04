package Patrones.Templ;

//main
public class Prueba {
    public static void main(String[] args){
        AllStar partido = new Mls();
        partido.juego();
        System.out.println();

        partido = new Nba();
        partido.juego();

    }
    
}
