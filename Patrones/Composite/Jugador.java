package Patrones.Composite;
import java.util.ArrayList;
import java.util.List;

//informacion y lista de jugadores
public class Jugador {
    private String nombre;
    private String equipo;
    private int salario;
    private List<Jugador> plantilla;

    public Jugador(String nombre, String equipo, int salario){
        this.nombre = nombre;
        this.equipo = equipo;
        this.salario = salario;

        plantilla = new ArrayList<Jugador>();
    }

    public void add(Jugador e){
        plantilla.add(e);
    }

    public void remove(Jugador e){
        plantilla.remove(e);
    }

    public List<Jugador> getPlantilla(){
        return plantilla;
    }

    public String toString(){
        return ("Jugador :[ Nombre: " + nombre + ", equipo: " + equipo + ", salario: " + salario + " ]");
    }
}
