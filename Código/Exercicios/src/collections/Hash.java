package collections;
import classes.Usuario;

import java.util.HashSet;

public class Hash {

    public static void main (String[] args){

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro", "pedro.lacerda@gmail.com"));
        usuarios.add(new Usuario("Guilherme", "gui.lacerda@gmail.com"));

        boolean result = usuarios.contains(new Usuario("Guilherme", "gui.lacerda@gmail.com"));
        System.out.println(result);
    }
}
