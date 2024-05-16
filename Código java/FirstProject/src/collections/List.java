package collections;
import classes.Usuario;
import java.util.ArrayList;

public class List {

    public static void main (String [] args){
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana", "ana@email.com");

        lista.add(u1);
        lista.add(new Usuario("Carlos", "carlosdebermuda@email.com"));
        lista.add(new Usuario("Flaviana", "flaviana@email.com"));

        System.out.print(lista.get(1)); //acessar pelo indice -> printa o endereco

        //certo:
        lista.remove(1);

        //certo:
        lista.remove(u1);

        //errado:
        System.out.println(lista.remove(new Usuario("Flaviana", "flaviana@email.com")));
        lista.remove(new Usuario("Flaviana", "flaviana@email.com"));

        //certo:
        lista.contains(u1);

        //errado:
        lista.contains(new Usuario("Carlos", "carlosdebermuda@email.com"));
        for(Usuario u: lista){
            System.out.print(u.nome);
        }
    }
}
