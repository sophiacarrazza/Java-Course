package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas do Aluno");
        int qnt_notas = ler.nextInt();

        double[] notas = new double[qnt_notas];
        for (int i = 0; i < qnt_notas; i++) {
            System.out.println("Informe a nota " + (i + 1));
            notas[i] = ler.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        System.out.println("As notas digitadas são: " + (Arrays.toString(notas)));
        System.out.println("A media de notas desse aluno é: " + (total/qnt_notas));

    }

}
