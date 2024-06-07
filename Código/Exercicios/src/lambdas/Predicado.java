package lambdas;
import classes.Produto;
import java.util.function.Predicate;

public class Predicado {

    public static void main (String [] args){
        Predicate<Produto> isCaro =
                produto -> (produto.preco * (1 - produto.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 4500.80, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
