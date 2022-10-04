package Patrones.Iterator;

//Coleccion nombres
public class Nombre implements Contenedor {
    public String nombres[] = {"Diana", "Gis", "Oscar", "Karla"};

    @Override
    public Iterador getIterador(){
        return new NombreIterador();
    }

    private class NombreIterador implements Iterador {
        int i;

        @Override
        public boolean otroMas(){
            if(i < nombres.length){
                return true;
            }
            return false;
        }

        @Override
        public Object otro(){
            if(this.otroMas()){
                return nombres[i++];
            }
            return null;
        }
    }
}
