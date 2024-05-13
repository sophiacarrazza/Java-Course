package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        return dia + "/" + mes + "/" + ano + "\n";
    }

    void imprimirDataFormatada(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);

    }
}
