import java.util.ArrayList;
import java.util.Collections;

public class Bombo {
    private ArrayList<Integer> bolas; //Generar un arraylist que equivaldría a las bolas 
                                      // dentro del bombo
    public Bombo(){
        bolas = new ArrayList<>();
        for(int i = 0; i < 90; i++){ //Rellenar el bombo con las bolas del 1 al 90 incluidos
            bolas.add(i);
        }
        Collections.shuffle(bolas); //Se barajan las bolas para que salgan aleatorias
    } 

    public int sacarbola(){
        if(bolas.isEmpty()){
            return -1;
        }
        return bolas.remove(0);
    }

    public boolean quedanBolas(){
        return !bolas.isEmpty();
    }
}
