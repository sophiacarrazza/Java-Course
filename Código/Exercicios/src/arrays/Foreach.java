package arrays;
import java.util.Arrays;

public class Foreach {

    public static void main (String[] args) {
        double[] notas = {9.9, 7.6, 4.5, 6.2};

        //se vc quer percorrer por todos os elementos do array,
        //usa-se o foreach

        System.out.println(Arrays.toString(notas));

        //isso:
        for(int i=0; i<notas.length; i++){ // for normal
            System.out.print(notas[i] + " ");
        }
        System.out.print("\n");

        //é a mesma coisa que:

        for(double nota: notas){ // foreach
            System.out.print(nota + " ");
        }
        System.out.print("\n");

        //for' loop can be replaced with enhanced 'for' é a mensagem que
        //aparece no primeiro for, pois o proprio java reconhece que usar
        //um foreach nesse caso é mais vantajoso
    }

}
