package fundamentos.desafios;
import java.util.Scanner;

public class DesafioModulo {

    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite a variável x");
        double a = sc.nextDouble();
        System.out.println("Digite a variável y");
        double b = sc.nextDouble();
        System.out.println("Digite a operação desejada");
        System.out.println("Soma -> +");
        System.out.println("Subtração -> -");
        System.out.println("Multiplicação -> *");
        System.out.println("Divisão -> /");
        System.out.println("Resto da divisão -> %");
        String op = sc.next();
    /*
        if (op.equals("+")){
            double resp = a + b;
            System.out.printf("%.2f + %.2f = %.2f", a, b, resp);
        } else if (op.equals("-")){
            double resp = a - b;
            System.out.printf("%.2f - %.2f = %.2f", a, b, resp);
        } else if (op.equals("*")){
            double resp = a * b;
            System.out.printf("%.2f x %.2f = %.2f", a, b, resp);
        } else if (op.equals("/")){
            double resp = a / b;
            System.out.printf("%.2f / %.2f = %.2f", a, b, resp);
        } else if (op.equals("%")){
            double resp = a % b;
            System.out.printf("o resto da divisão de %.2f por %.2f = %.2f", a, b, resp);
        }
    */
        //mais elegante
        double resultado = "+".equals(op) ? a + b : 0;
        resultado = "-".equals(op) ? a - b : resultado;
        resultado = "*".equals(op) ? a * b : resultado;
        resultado = "/".equals(op) ? a / b : resultado;
        resultado = "%".equals(op) ? a % b : resultado;
        System.out.printf("%.2f %s %.2f = %.2f", a, op, b, resultado);




    }
}
