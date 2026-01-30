import java.util.ArrayList;
import java.util.Collections;

public class Carton {
    private ArrayList<Integer> numeros;

    public Carton() {
        numeros = new ArrayList<>();
        ArrayList<Integer> posibles = new ArrayList<>();
        for (int i = 1; i <= 90; i++) posibles.add(i);
        Collections.shuffle(posibles);
        
        // Creamos un cartón de 27 posiciones (3 filas x 9 columnas)
        for (int i = 0; i < 27; i++) {
            numeros.add(posibles.get(i));
        }
    }

    public void comprobar(int bola) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == bola) {
                numeros.set(i, -1); // Tachamos con -1
            }
        }
    }

    public boolean esBingo() {
        for (int n : numeros) {
            if (n != -1) return false;
        }
        return true;
    }

    public void imprimirCarton() {
        int contador = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 9; col++) {
                int num = numeros.get(contador);
                if (num == -1) {
                    System.out.print("[XX] ");
                } else {
                    System.out.printf("[%2d] ", num);
                }
                contador++;
            }
            System.out.println();
        }
    }
}