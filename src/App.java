import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        System.out.println("¡BIENVENIDOS AL GRAN BINGO!");
        System.out.println("----------------------------------");
=======
        
        // Creamos los objetos necesarios
        Bombo b = new Bombo();
        ArrayList<Jugador> jugadores = new ArrayList<>();
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6

        // Añado unos cuantos jugadores
        jugadores.add(new Jugador("Andres"));
        jugadores.add(new Jugador("Fabio"));
        jugadores.add(new Jugador("Noelia"));
        jugadores.add(new Jugador("Luis"));

        boolean hayGanador = false;

        System.out.println("--- EMPIEZA EL BINGO ---");

        // Bucle principal
        while (b.quedanBolas() && !hayGanador) {
            
            // Espero un poco para que no salga todo de golpe
            Thread.sleep(150); 

<<<<<<< HEAD
            // Sacamos bola
            int bola = bombo.sacarBola();
            System.out.println("\nHa salido el número: " + bola);

            // Avisamos a todos los jugadores
            for (Jugador jugador : listaJugadores) {
                // El método jugar devuelve true si ha hecho Bingo
                boolean haGanado = jugador.jugar(bola);

                if (haGanado) {
                    System.out.println(" ¡BINGO! ¡Ha ganado " + jugador.getNombre() + "! ");
                    
                    tenemosGanador = true;
                    break; // Rompemos el for para dejar de avisar a otros
=======
            int num = b.sacarBola();
            System.out.println("Ha salido el: " + num);

            // Comprobar cartones de todos
            for (Jugador j : jugadores) {
                boolean exito = j.jugar(num);
                
                if (exito) {
                    System.out.println("\n-----------------------------");
                    System.out.println("BINGO!!! Ha ganado " + j.getNombre());
                    System.out.println("-----------------------------\n");
                    hayGanador = true;
                    break; 
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
                }
            }
        }

        System.out.println("Terminado.");
    }
}