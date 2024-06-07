package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int i, int i1, int i2) {
        dia = i;
        mes = i1;
        ano = i2;
    }

    String obterDataFormatada(){
        return dia + "/" + mes + "/" + ano + "\n";
    }

    void imprimirDataFormatada(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);

    }
}
