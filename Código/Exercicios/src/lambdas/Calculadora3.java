package lambdas;
import java.util.function.BinaryOperator;

public class Calculadora3 {
    public static void main (String [] args){


        // java nao permite int -> Double
        //so permite int -> double e double -> Double
        BinaryOperator<Double> soma = (x, y) -> { return x + y;};
        System.out.println(soma.apply(2.0, 3.0));
        //ou
        soma = (x, y) -> x * y;
        //ou
        soma = Double::sum;

    }
}
