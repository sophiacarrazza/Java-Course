package fundamentos;
import java.util.Scanner;

public class AreaCircunferencia {

    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");

        double raio = ler.nextDouble();

        //final -> uma vez que vc tem esse valor, ele não poderá mais ser mudado
        final double pi = 3.14159;

        double area = pi * raio * raio;
        System.out.println("Area: " + area + "m2");

    }
}
