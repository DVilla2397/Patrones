package Patrones.Adapter;

public class Sonido implements ConsolaAudio{

    //Video y audio funcionan al mismo tiempo
    Adaptador adaptador;

    @Override
    public void reproducir(String tipoSonido, String nombreCancion){
        if(tipoSonido.equalsIgnoreCase("cancion en lista")){
            System.out.println("La cancion de la lista que suena es: " + nombreCancion);
        }else if (tipoSonido.equalsIgnoreCase("Pantalla chica") || tipoSonido.equalsIgnoreCase("Pantalla grande")){
            adaptador = new Adaptador(tipoSonido);
            adaptador.reproducir(tipoSonido, nombreCancion);
        }

        else{
            System.out.println("Error, orden incompatible");
        }
    }
    
}
