package Patrones.Adapter;

//Queremos que los instrumentos suenen al mismo tiempo que el video cuando se reproduce.
public class Adaptador implements ConsolaAudio{

    ConsolaVideo consolaVideo;

    public Adaptador(String tipoSonido){
        if(tipoSonido.equalsIgnoreCase("Pantalla chica")){
            consolaVideo = new VideopChica();
        }else if(tipoSonido.equalsIgnoreCase("Pantalla grande")){
            consolaVideo = new VideopGrande();
        }
    }

    @Override
    public void reproducir(String tipoSonido, String nombreCancion){
        if (tipoSonido.equalsIgnoreCase("Pantalla chica")){
            consolaVideo.videoChico(nombreCancion);
        }else if(tipoSonido.equalsIgnoreCase("Pantalla grande")){
            consolaVideo.videoGrande(nombreCancion);
        }
    }
    
}
