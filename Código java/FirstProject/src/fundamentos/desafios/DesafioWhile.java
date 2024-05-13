package fundamentos.desafios;
import java.util.Scanner;

public class DesafioWhile {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double soma = 0, media;
        int qntd_notas = 0;

        System.out.println("Digite a nota do aluno 1");
        double nota = sc.nextDouble();
        while(nota != -1){

            if(nota >= 0 && nota <=10){
                qntd_notas++;
                soma += nota;
            } else{
                System.out.println("Nota inválida");
            }

            System.out.println("Digite a nota do aluno " + (qntd_notas + 1));
            nota = sc.nextDouble();
        }
        media = soma / qntd_notas;
        System.out.println("A media da turma é: " + media);
    }
}
