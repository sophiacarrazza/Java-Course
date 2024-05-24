package fundamentos;

public class NotacaoPonto {

    public static void main (String[] args){

        String s = ("Bom dia X");
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String y = "Bom dia X!".replace("X", "Gui");
        System.out.println(y);

        //tipos primitivos nao tem o operador ".", pois a unica coisa
        //que ele armazena é o seu valor e nada mais.
        //ex: está errado -> int a = 3; a.

    }
}
