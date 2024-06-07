package classes.desafioclasses;

public class Jantar {

    public static void main (String [] args){

        Pessoa p1 = new Pessoa("Marcos", 80);
        Comida c1 = new Comida("Hamburguer", 0.10);
        System.out.println(p1.nome + ", antes de comer, pesava " + p1.peso);

        p1.comer(c1);

        System.out.println(p1.nome + ", depois de comer, pesa " + p1.peso);


    }
}
