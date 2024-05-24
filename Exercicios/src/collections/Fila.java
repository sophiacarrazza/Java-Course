package collections;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main (String [] args){
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // .add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // .offer() retorna falso caso a fila esteja cheia.
        //a diferença é só o comportamento quando a  fila está cheia

        fila.add("Jose");
        fila.add("Mateus");
        fila.add("Livia");

        System.out.println(fila.peek()); // retorna false se a fila estiver vazia
        System.out.println(fila.element()); // lança uma exceção se a fila estiver vazia
        //a diferença é só o comportamento quando a  fila está vazia

        //Peek e Element -> obtem o proximo elemento da fila (sem remover)

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);

        System.out.println(fila.poll()); //retorna null se a fila estiver vazia e vc remover
        System.out.println(fila.remove()); // lança uma exceção se a fila estiver vazia e vc remover

        //Poll e Remove -> obtem o proximo elemento da fila e remove


    }
}
