package oo.oo.Encapsulamento;

public class PessoaTeste {


    public static void main (String[] args){

        Pessoa p1 = new Pessoa("Julio", "de Castilho", -30);
        p1.setIdade(35);
        p1.setIdade(-40);

        System.out.print(p1.getNomeCompleto() + " - ");
        System.out.println(p1.getIdade() + " anos");
    }
}
