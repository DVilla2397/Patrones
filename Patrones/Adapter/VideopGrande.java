package Patrones.Adapter;

public class VideopGrande implements ConsolaVideo{
    @Override
    public void videoChico(String tipoVideo){

    }

    @Override
    public void videoGrande(String tipoVideo){
        System.out.println("Video con calidad: " + tipoVideo);
    }
    
}
