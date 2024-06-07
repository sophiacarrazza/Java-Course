package lambdas;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import classes.Produto;

public class Consumidor {
    //Consumer<T>
    //Represents an operation that accepts a single input argument and returns no result.
    public static void main (String [] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto ("Caneta", 1, 0.9);
        imprimir.accept(p1);

        Produto p2 = new Produto ("Lapis", 3, 0.2);
        imprimir.accept(p2);

        List<Produto> produtos = Arrays.asList(p1, p2);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println); //imprime os produtos diretamente
    }
}
