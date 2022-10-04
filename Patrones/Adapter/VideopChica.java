package Patrones.Adapter;

//Calidad del video pantallas chicas
public class VideopChica implements ConsolaVideo{
    @Override
    public void videoChico(String tipoVideo){
        System.out.println("Video con calidad: " + tipoVideo);
    }
    
    @Override
    public void videoGrande(String tipoVideo){
        //VideopGrande.java
    }
}
