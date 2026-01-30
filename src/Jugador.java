import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carton> misCartones;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.misCartones = new ArrayList<>();
<<<<<<< HEAD
        // Le damos un cartón al empezar
=======
        // Le damos un cartón al crearlo
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
        misCartones.add(new Carton());
    }

    public boolean jugar(int bola) {
<<<<<<< HEAD
        boolean haGanado = false;
        
        for (Carton carton : misCartones) {
            carton.comprobarNumero(bola);
            if (carton.esBingo()) {
                haGanado = true;
            }
        }
        return haGanado;
    }

    public String getNombre() {
        return this.nombre;
=======
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
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
    }
}