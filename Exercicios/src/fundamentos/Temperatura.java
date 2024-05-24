package fundamentos;
import java.util.*;

public class Temperatura {

    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        //formula de conversão de F
        //(°F-32) x 5/9 = C°
        final int t1 = 32;
        final double t2 = 5.0/9;

        System.out.println("Digite sua temperatura em Farenheit");
        double f = ler.nextDouble();

        double c = (f - t1) * t2;
        System.out.printf("A temperatura digitada em Celsius é:  %.2f", c);



    }
}
