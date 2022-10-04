package Patrones.Bridge;

//Valores cuadrado
public class Cuadrado extends Forma{
    private int perimetro, x, y;
    
    public Cuadrado(int perimetro, int x, int y, Puente puente){
        super(puente);
        this.perimetro = perimetro;
        this.x = x;
        this.y = y;
    }
    public void dibujar(){
        puente.dibujarCuadrado(perimetro, x, y);
    }
}
