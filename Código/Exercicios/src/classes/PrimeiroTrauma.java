package classes;

public class PrimeiroTrauma {
    int a = 3; // atributo da instancia (precisamos criar uma pra acessar ela)

    // erro: non-static variable a cannot be referenced from a static context

    // (não conseguimos acessar diretamente um valor que pertence a uma instância
    // a partir de um membro estático)

    // logo, devemos criar uma instancia, que é permitida acessar esse valor q tb é de instância,
    // para acessa-lo e usar no contexto estatico.

    static int b = 4; // (ou vc pode ja criar a variavel estatica)

    public static void main (String[] args){
        PrimeiroTrauma p = new PrimeiroTrauma();

        System.out.println(p.a); // acessamos o valor por uma instancia
        System.out.println(b);
    }
}
