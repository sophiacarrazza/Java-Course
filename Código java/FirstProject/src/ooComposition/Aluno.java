package ooComposition;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome){
        this.nome = nome;
        // não pode fzr isso pq o valor do endereço de cursos é constante:
        // mas vc pode alterar o conteudo dela! (os valores de dentro), só
        //não pode mudar a referencia dessa lista.
        // this.cursos = new ArrayList<Curso>();
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
