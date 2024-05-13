package fundamentos;
import java.util.Scanner;

public class TipoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println('a');

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); //true
        System.out.println(s.startsWith("boa")); //false
        System.out.println(s.toLowerCase().startsWith("boa")); //true
        System.out.println(s.toUpperCase().endsWith("TARDE")); //true
        System.out.println(s.equals("boa tarde")); //false
        System.out.println(s.equalsIgnoreCase("boa tarde")); //true

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.890;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n");

        //p comparação de Strings:
        String dois = new String("2");
        System.out.println("2".equals(dois));

        String doiscomespacos = sc.nextLine();
        System.out.println(doiscomespacos);
        //next line = conta os espaços em branco a mais que a gnt coloca
        //next = não conta os espaços em branco
        //o trim tira os espaços em branco da string
        System.out.println("2".equals(doiscomespacos.trim())); //true

    }
}
