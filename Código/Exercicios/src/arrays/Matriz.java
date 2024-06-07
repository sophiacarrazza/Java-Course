package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Matriz {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qntdAlunos = ler.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qntdNotas = ler.nextInt();

        double [][] matriz = new double[qntdAlunos][qntdNotas];
        double total = 0;

        for(int i=0; i<qntdAlunos; i++){
            for(int j=0; j<qntdNotas; j++) {
                System.out.printf("Informe a nota %d do aluno %d\n", j+1, i+1);
                matriz[i][j]= ler.nextDouble();
                total += matriz[i][j];
            }
        }
        double media = total/(qntdNotas * qntdAlunos);

        System.out.printf("A média dos alunos é: %.2f", media);
    }

}
