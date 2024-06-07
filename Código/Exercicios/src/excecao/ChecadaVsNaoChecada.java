package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
            geraErro1();

        try { // tratamento de erro
            geraErro2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fim");
    }

    //Exceção não checada ou não verificada
    static void geraErro1(){
        new RuntimeException("Ocorreu um erro mto bão, #01!");
    }

    //Exceção checada/ verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro mto bão, #02!");
    }


}
