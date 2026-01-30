import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("BIENVENIDO AL BINGO!");
        System.out.println("----------------------------------");
        
        Bombo b = new Bombo();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        jugadores.add(new Jugador("Andres"));
        jugadores.add(new Jugador("Fabio"));
        jugadores.add(new Jugador("Noelia"));
        jugadores.add(new Jugador("Luis"));

        // 1. Mostrar cartones iniciales
        System.out.println("--- CARTONES INICIALES ---");
        for (Jugador j : jugadores) {
            j.mostrarCartones();
        }

        boolean hayGanador = false;
        System.out.println("--- EMPIEZA EL BINGO ---");

        while (b.quedanBolas() && !hayGanador) {
            Thread.sleep(150); 

            int num = b.sacarBola();
            System.out.println("Ha salido el: " + num);

            for (Jugador j : jugadores) {
                if (j.jugar(num)) {
                    System.out.println("\n-----------------------------");
                    System.out.println("BINGO!!! Ha ganado " + j.getNombre());
                    System.out.println("-----------------------------\n");
                    hayGanador = true;
                    break; 
                }
            }
        }

        // Mostrar estado final (tachados)
        System.out.println("--- ESTADO FINAL DE LOS CARTONES ---");
        for (Jugador j : jugadores) {
            j.mostrarCartones();
        }

        System.out.println("Terminado.");
    }
}