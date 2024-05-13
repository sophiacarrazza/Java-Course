package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args){
        //infos do funcionário

        //tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 3268;
        int id = 56789;

        //valores literais = colocar um numero direto no programa (n eh system.in, tals)
        //nesse long, o numero passa o inteiro, então colocamos um L
        //para mostrar que é um literal LONG.
        long pontosAcumulados = 2_234_845_223L;

        //tipos numericos reais
        //o java entende que ta entregando um double, entao temos que colocar F no numero
        float salario = 11_445.44F;
        double vendasAcumuladas = 22_991_797_103.01;

        //tipos booleanos
        boolean estaDeFerias = true;

        //tipos de caracteres
        char status = '\u0010'; //= numero dentro da tabela unicode

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

    }
}
