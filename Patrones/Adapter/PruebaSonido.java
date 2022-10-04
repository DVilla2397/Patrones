package Patrones.Adapter;

//Nuestro main
public class PruebaSonido {
    public static void main(String[] args){
        Sonido sonido = new Sonido();

        sonido.reproducir("Pantalla chica", "Ruedas girando");
        sonido.reproducir("Pantalla grande", "Carretera");
        sonido.reproducir("cancion en lista", "Detroit Rock City");
        sonido.reproducir("Bajo", "nivel 20");
    }
}
