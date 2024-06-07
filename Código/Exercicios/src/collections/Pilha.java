package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {


    public static void main (String [] args){

        //criando uma pilha de livros
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O Pequeno Principe");
        livros.push("O apanhador no campo de centeio");

        livros.add("Redoma de vidro");
        livros.add("Como eu era antes de você");

        System.out.println(livros.peek()); // recebe o ultimo elemento da pilha (o que ta no topo da pilha)
        System.out.println(livros.element());

        System.out.println(livros.remove());
        System.out.println(livros.pop()); //tb retorna exceção se a pilha estiver vazia
        System.out.println(livros.poll());

        //mesmos metodos de size, clear, contains, etc

        // da pra usar o foreach tb

    }
}
