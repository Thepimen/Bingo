import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Carton {
    private Map<Integer, Boolean> numeros;

    private void generarCarton(){
        Random rand = new Random();
        while(numeros.size() < 15){
            int num = rand.nextInt(90) + 1;
            numeros.putIfAbsent(num, false); 
            //Este put solo va a añadir si NO EXISTE la clave, se inicializa a false
            //Para que sea no tachado
        }
    }

    public void comprobarNumero(int bola){
        if(numeros.containsKey(bola)){
            numeros.put(bola, true);
            System.out.println("Numero tachado: "+ bola + "!");
        }
    }

    public boolean esBingo(){
        return !numeros.containsValue(false);
    }

    public void mostrarCarton(){
        System.out.println("Carton: "+ numeros.keySet());
    }

    public Carton(){
        numeros = new HashMap<>();
        generarCarton();
    }
    
}
