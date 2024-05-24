package classes;

public class ValorvsReferencia {

    public static void main (String[] args){
        double a = 2;
        double b = a; //atribução por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; //atribuição por referência (objeto)

        d1.dia = 31; //impacta nos dois, pq eles tem o mesmo endereço de memória
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarValorPadrao(d1); //vai alterar os dois

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c); //continua como 5, pq esse valor foi passado uma copia em uma funcao que nao retorna nada
    }
    static void voltarValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
