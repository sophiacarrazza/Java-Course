package fundamentos;
import java.util.Scanner;

public class Console {

    public static void main (String[] args){
        System.out.print("bom ");
        System.out.print("dia\n");
        System.out.println("bom dia");

        System.out.printf("Megasena: %d %d%n",1, 2);
        System.out.printf("Salario: %.1f%n",1234.4563);
        System.out.printf("Nome: %s%n","Joao");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); //precisa ler pq o nextint le o \n depois
        //do numero, e precisamos tirar ele do buffer de entrada pra próxima
        //leitura (se tiver).

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);


    }
}
