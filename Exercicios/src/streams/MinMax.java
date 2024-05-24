package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static <Predicate> void main(String[] args) {

        Aluno a1 = new Aluno("Amanda", 7.8);
        Aluno a2 = new Aluno("Bia", 9);
        Aluno a3 = new Aluno("Daniel", 6.5);
        Aluno a4 = new Aluno("Tiago", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get()); //retorna a melhor nota
        System.out.println(alunos.stream().min(melhorNota).get()); //retorna a pior nota
        System.out.println(alunos.stream().max(piorNota).get()); //retorna a pior nota



    }
}
