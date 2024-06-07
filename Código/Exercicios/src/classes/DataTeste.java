package classes;

public class DataTeste {

    public static void main (String[] args) {
        Data torresgemeas = new Data(11,9,2001);
//        torresgemeas.dia = 11;
//        torresgemeas.mes = 9;
//        torresgemeas.ano = 2001;

        Data joanadarc = new Data(30,5,1431);
//        joanadarc.dia = 30;
//        joanadarc.mes = 5;
//        joanadarc.ano = 1431;

        System.out.printf(torresgemeas.obterDataFormatada());
        joanadarc.imprimirDataFormatada();



    }
}
