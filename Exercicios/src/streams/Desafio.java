package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Desafio {

    public static void main(String[] args) {
        Consumer<String> println = System.out::println;
        Consumer<Integer> printlni = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
//        marcas.stream().map(m->m.toUpperCase()).forEach(print);

        Function<Integer, String> conversaoBinario =
                n -> Integer.toBinaryString(n);

        UnaryOperator<String> reverso =
                n -> new StringBuilder(n).reverse().toString();

        Function<String, Integer> conversaoDecimal =
                n -> Integer.parseInt(n, 2);

        nums.stream()
                .map(conversaoBinario)
                .map(reverso)
                .map(conversaoDecimal)
                .forEach(printlni);



    }
}
