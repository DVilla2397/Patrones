package Patrones.Composite;

//main
public class Prueba {
    public static void main(String[] args){
        Jugador delantero = new Jugador("Cristiano", "Pericos", 130000);

        Jugador portero = new Jugador("Oswaldo", "Guerreros", 8000000);

        Jugador defensa = new Jugador("Rafael", "Indios", 90000000);

        delantero.add(portero);
        delantero.add(defensa);

        portero.add(delantero);
        portero.add(defensa);

        defensa.add(portero);
        defensa.add(delantero);

        System.out.println(delantero);

        for(Jugador jugadorPrincipal : delantero.getPlantilla()){
            System.out.println(jugadorPrincipal);
            
            for (Jugador jugador : jugadorPrincipal.getPlantilla()){
                System.out.println(jugador);
            }
        }
    }
}
