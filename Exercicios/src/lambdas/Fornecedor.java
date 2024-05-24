package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class Fornecedor {

    public static void main (String [] args){

        //fornecedor de uma lista
        //nao recebe parametro e nao retorna nada, só cria algo
        Supplier <List<String>> umLista =
                () -> Arrays.asList("Ana", "Bia", "Gui", "Lia");

                System.out.println(umLista.get());
    }
}
