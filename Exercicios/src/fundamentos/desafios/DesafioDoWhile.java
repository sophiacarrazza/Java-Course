package fundamentos.desafios;
import java.util.Scanner;

public class DesafioDoWhile {

    public static void main (String [] args){
        Scanner sc =  new Scanner(System.in);

//        String fala = sc.next();
//        while(fala.equalsIgnoreCase("stop")){
//            fala = sc.next();
//        }
        String texto = "por favor";
        //while indeterminado = do while
        do {
            System.out.println("Você precisa falar as palavras mágicas:");
            System.out.println("Você quer isto?");
            texto = sc.nextLine();
        }while(!texto.equalsIgnoreCase("por favor"));

    }
}
