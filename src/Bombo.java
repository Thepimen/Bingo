import java.util.ArrayList;
import java.util.Collections;

public class Bombo {
    private ArrayList<Integer> bolas;

    public Bombo() {
        bolas = new ArrayList<>();
<<<<<<< HEAD
        // Rellenamos del 1 al 90
        for (int i = 1; i <= 90; i++) {
            bolas.add(i);
        }
        // Las barajamos
=======
        // Metemos los 90 números
        for (int i = 1; i <= 90; i++) {
            bolas.add(i);
        }
        // Barajamos
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
        Collections.shuffle(bolas);
    }

    public int sacarBola() {
<<<<<<< HEAD
        // Si no hay bolas, devolvemos -1
=======
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
        if (bolas.isEmpty()) {
            return -1;
        }
        return bolas.remove(0); 
    }
<<<<<<< HEAD
    
    public boolean quedanBolas() {
        // Devuelve true si la lista NO está vacía
=======

    public boolean quedanBolas() {
>>>>>>> 220bb520576f3b705c9ea7677f5294016dc7edf6
        return !bolas.isEmpty();
    }
}