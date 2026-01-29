import java.util.HashMap;
import java.util.Random;

public class Carton {
    // La Clave es el número, el Valor es si está tachado true/false
    private HashMap<Integer, Boolean> numeros;

    public Carton() {
        numeros = new HashMap<>();
        generarCarton();
    }

    private void generarCarton() {
        Random r = new Random();
        // Generamos 15 números sin repetir
        while (numeros.size() < 15) {
            int n = r.nextInt(90) + 1;
            // Solo lo añade si no existe ya
            if (!numeros.containsKey(n)) {
                numeros.put(n, false); // false = no tachado
            }
        }
    }

    public void comprobar(int bola) {
        if (numeros.containsKey(bola)) {
            numeros.put(bola, true); // Lo tachamos
        }
    }

    public boolean esBingo() {
        // Si hay algún valor false, no es bingo
        if (numeros.containsValue(false)) {
            return false;
        }
        return true;
    }
}