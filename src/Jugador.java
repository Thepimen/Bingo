import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carton> misCartones;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.misCartones = new ArrayList<>();
        misCartones.add(new Carton());
    }

    public boolean jugar(int bola){
        boolean ganaste = false;

        for(Carton carton : misCartones){
            carton.comprobarNumero(bola);
            if(carton.esBingo()){
                ganaste = true;
            }
        }
        return ganaste;
    }  
}
