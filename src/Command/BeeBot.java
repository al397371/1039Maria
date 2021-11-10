package Command;

import java.util.LinkedList;

public class BeeBot {

    private LinkedList<String> guardado = new LinkedList<>();

    public void mover(String movimiento){
        guardado.add(movimiento);
    }

    public void go(){
        for(String x : guardado){
            System.out.println(x);
        }
        guardado.clear();
    }
    public void delete(){
        guardado.remove(guardado.size()-1);
    }
}
