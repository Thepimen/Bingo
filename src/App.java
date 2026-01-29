import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("🎉 ¡BIENVENIDOS AL GRAN BINGO! 🎉");
        System.out.println("----------------------------------");

        // 1. Preparamos el bombo
        Bombo bombo = new Bombo();

        // 2. Registramos a los jugadores (usando ArrayList)
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(new Jugador("María"));
        listaJugadores.add(new Jugador("Pepe"));
        listaJugadores.add(new Jugador("Lucía"));

        // Variable para controlar el bucle
        boolean tenemosGanador = false;

        // 3. Empieza el juego: Sacamos bolas mientras no haya ganador y queden bolas
        while (!tenemosGanador && bombo.quedanBolas()) {
            
            // Pausa de medio segundo para dar emoción (500 milisegundos)
            Thread.sleep(100); 

            // Sacamos bola
            int bola = bombo.sacarBola();
            System.out.println("\n🎱 Ha salido el número: " + bola);

            // Avisamos a todos los jugadores
            for (Jugador jugador : listaJugadores) {
                // El método jugar devuelve true si ha hecho Bingo
                boolean haGanado = jugador.jugar(bola);

                if (haGanado) {
                    System.out.println("\n⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
                    System.out.println(" ¡BINGO! ¡Ha ganado " + jugador.getNombre() + "! 🏆");
                    System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
                    
                    tenemosGanador = true;
                    break; // Rompemos el for para dejar de avisar a otros
                }
            }
        }

        System.out.println("\nFin del juego.");
    }
}