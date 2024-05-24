package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //faz a conversao automatica double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // int -> Integer
        conjunto.add('X'); // char -> Character

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('X');
        //vai continuar com o mesmo tamanho, pq o HashSet nao aceita repetições
        System.out.println("O tamanho do conjunto é: " + conjunto.size());
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println( "Set Nums: " + nums);
        System.out.println( "HashSet Conjunto: " + conjunto);

        conjunto.addAll(nums); // união
        System.out.println("União: " + conjunto);

        conjunto.retainAll(nums); // interseção
        System.out.println("Interseção: " + conjunto);

        conjunto.clear();
        System.out.println("Clear: " + conjunto);

        //Character a = 'a';
        //System.out.println(a);

    }
}
