import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carton> misCartones;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.misCartones = new ArrayList<>();
        misCartones.add(new Carton());
    }

    public boolean jugar(int bola) {
        for (Carton c : misCartones) {
            c.comprobar(bola);
            if (c.esBingo()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarCartones() {
        System.out.println("Cartones de " + nombre + ":");
        for (Carton c : misCartones) {
            c.imprimirCarton();
        }
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }
}