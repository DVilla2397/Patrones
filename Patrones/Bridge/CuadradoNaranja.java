package Patrones.Bridge;

public class CuadradoNaranja implements Puente {
    @Override
    public void dibujarCuadrado(int perimetro, int x, int y){
        System.out.println("Dibujando cuadrado[ color: naranja, perimetro: " + perimetro + ", x: " + x + ", y: " + y + "]");
    }
    
}

