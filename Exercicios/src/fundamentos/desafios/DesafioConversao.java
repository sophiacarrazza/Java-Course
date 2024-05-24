package fundamentos.desafios;
import java.util.*;

public class DesafioConversao {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores dos seus 3 últimos salários: ");
        String s1 = sc.next().replace(",", ".");
        String s2 = sc.next().replace(",", ".");
        String s3 = sc.next().replace(",", ".");

        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        double v3 = Double.parseDouble(s3);

        double media = (v1 + v2 + v3)/ 3;

        System.out.printf("A média de seus salários é: %.2f", media);


    }
}
