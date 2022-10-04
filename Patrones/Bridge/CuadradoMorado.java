package Patrones.Bridge;

public class CuadradoMorado implements Puente {
    @Override
    public void dibujarCuadrado(int perimetro, int x, int y){
        System.out.println("Dibujando cuadrado[ color: morado, perimetro: " + perimetro + ", x: " + x + ", y: " + y + "]");
    }
    
}
