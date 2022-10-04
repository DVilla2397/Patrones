package Patrones.Bridge;

//main
public class Prueba {
    public static void main(String[] args){
        Forma CuadradoMorado = new Cuadrado(40, 40, 40, new CuadradoMorado());
        Forma CuadradoNaranja = new Cuadrado(40, 40, 40, new CuadradoNaranja());

        CuadradoMorado.dibujar();
        CuadradoNaranja.dibujar();
    }
}
