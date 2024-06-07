package lambdas;

public class Calculadora2 {

    public static void main (String [] args){

        // arrow functions
        Calculo soma = (x,y) -> {
            return x + y; //lambda function
        };
        //ou
        soma = (x, y) -> x * y;
        //ou
        soma = Double::sum;

    }
}
