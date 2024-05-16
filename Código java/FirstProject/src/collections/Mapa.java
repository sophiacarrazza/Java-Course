package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main (String [] args){
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // adicionou
        usuarios.put(1, "Marcia"); // alterou

        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rebeca");
        usuarios.put(4, "Joao");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); //keyset retorna todas as chaves
        System.out.println(usuarios.values()); //values retorna todas os valores
        System.out.println(usuarios.entrySet()); //values retorna todas as chaves com os valores

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Marcia"));

        System.out.println(usuarios.get(1)); //pega pela chave

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        //percorre todos os usuarios com chave e valor
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro);
        }


    }
}
