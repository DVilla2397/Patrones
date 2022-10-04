package Patrones.Iterator;
//main
public class Prueba {
    public static void main(String[] args){
        Nombre nombre = new Nombre();

        for (Iterador it = nombre.getIterador(); it.otroMas();){
            String nom = (String)it.otro();
            System.out.println("Nombre : " + nom);
        }
    }
}
