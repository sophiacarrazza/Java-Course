package collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {


    public static void main (String [] args){
//        Set<String> listaAprovados = new HashSet<String>();
        //ou
//        TreeSet<String> listaAprovados = new TreeSet<String>();
        //ou
        SortedSet<String> listaAprovados = new TreeSet<String>(); // Set aceita só o tipo determinado

        listaAprovados.add("Sophia");
        listaAprovados.add("Matheus");
        listaAprovados.add("Lucca");

//        listaAprovados.get(1); Não é possivel acessar pelo indice com o Set

        for(String candidatoAprovado : listaAprovados){
            System.out.print(candidatoAprovado + " ");
        }

    }
}
