package fundamentos;
import java.util.Scanner;

/**
 * @author Sophia Carrazza <sophiacarrazza7@gmail.com>
 * @since JDK1.0
 * @see
 */
public class PrimeiroPrograma {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    //tipos de comentarios
    /*
    *
    *
     */

    System.out.println("Escreva seu nome:");
    String nome = sc.nextLine();
    System.out.println("Hello, " + nome + "!");
    }
}