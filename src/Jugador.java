import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carton> misCartones;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.misCartones = new ArrayList<>();
        // Le damos un cartón al crearlo
        misCartones.add(new Carton());
    }

    public boolean jugar(int bola) {
        // Revisamos todos sus cartones
        for (Carton c : misCartones) {
            c.comprobar(bola);
            if (c.esBingo()) {
                return true; // Ha ganado!
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }
}