package classes;

public class DataTeste {

    public static void main (String[] args) {
        Data torresgemeas = new Data();
        torresgemeas.dia = 11;
        torresgemeas.mes = 9;
        torresgemeas.ano = 2001;

        Data joanadarc = new Data();
        joanadarc.dia = 30;
        joanadarc.mes = 5;
        joanadarc.ano = 1431;

        System.out.printf(torresgemeas.obterDataFormatada());
        joanadarc.imprimirDataFormatada();



    }
}
