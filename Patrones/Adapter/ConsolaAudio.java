package Patrones.Adapter;


//Control de los amplificadores dentro del escenario del concierto
public interface ConsolaAudio{
    public void reproducir(String tipoSonido, String nombreCancion);
}