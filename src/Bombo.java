import java.util.ArrayList;
import java.util.Collections;

public class Bombo {
    private ArrayList<Integer> bolas;

    public Bombo() {
        bolas = new ArrayList<>();
        // Rellenamos el bombo con los números del 1 al 90
        for (int i = 1; i <= 90; i++) {
            bolas.add(i);
        }
        // Mezclamos las bolas para que el orden sea aleatorio
        Collections.shuffle(bolas);
    }

    public int sacarBola() {
        // Si no hay bolas, devolvemos -1 para evitar errores
        if (bolas.isEmpty()) {
            return -1;
        }
        // Quitamos y devolvemos la primera bola de la lista
        return bolas.remove(0); 
    }

    public boolean quedanBolas() {
        // Devuelve true si la lista NO está vacía
        return !bolas.isEmpty();
    }
}