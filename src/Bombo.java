import java.util.ArrayList;
import java.util.Collections;

public class Bombo {
    private ArrayList<Integer> bolas;

    public Bombo() {
        bolas = new ArrayList<>();
        // Metemos los 90 números
        for (int i = 1; i <= 90; i++) {
            bolas.add(i);
        }
        // Barajamos
        Collections.shuffle(bolas);
    }

    public int sacarBola() {
        if (bolas.isEmpty()) {
            return -1;
        }
        return bolas.remove(0); 
    }

    public boolean quedanBolas() {
        return !bolas.isEmpty();
    }
}