package lambdas;

import classes.Produto;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main (String [] args){


        Function<Produto, Double> precoReal =
                p-> p.preco * (1-p.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500? preco * 1.085 :preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000? preco + 100.0 : preco + 50.0;

        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format(Locale.US,"%.2f", preco));

        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.99, 0.13);

        String preco = precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println(preco);

//        Double valorFinal = precoReal + impostoMunicipal + frete;
//        DecimalFormat df = new DecimalFormat("#.00");
//
//        String valorFormatado = df.format(valorFinal);
//        valorFormatado.replace('.', ',');


    }
}
