package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {


    BinaryOperator<Double> med=
            (n1, n2) -> (n1 + n2)/2;

    public static void main (String [] args){

        //1 operador
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2)/2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultado =
                (n1,n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Reprovado";

        //ou

        //entra dois sai 1
        BiFunction<Double, Double, String> result2 = (n1,n2) -> {
            double notamedia = ((n1 + n2)/2);
            return notamedia >=7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(result2.apply(9.8, 5.7));

        //entra 1 sai 1
        Function<Double,String> conceito =
                m -> m >= 7 ? "Aprovado" : "Reprovado";


        System.out.println(media.andThen(conceito).apply(9.8, 5.7));

    }


}
