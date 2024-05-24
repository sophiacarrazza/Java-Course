package excecao;

import streams.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirNomeDoAluno(a1); //(NullPointerException)
        } catch(Exception e){
            System.out.println("Ocorreu um erro ao imprimir o usuário");
        }
        //se vc não fizer nada no tratamento da exceção (ter um vazio dentro do catch),
        //vc estara silenciando a exceção

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(); // imprime a pilha de execução ate o problema
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome); //nao trata se o aluno é nulo

    }
}
