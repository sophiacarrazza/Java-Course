package ooComposition;

public class CursoTeste {

    public static void main (String [] args){
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Web 2023");
        Curso c3 = new Curso("React Native");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        c2.adicionarAluno(a1);
        c2.adicionarAluno(a3);

        a1.adicionarCurso(c3);
        a2.adicionarCurso(c3);
        a3.adicionarCurso(c3);

        for(Aluno aluno: c1.alunos){
            System.out.println("Estou matriculado no curso 1 ");
            System.out.println("e meu nome é " + aluno.nome);

        }

    }
}
