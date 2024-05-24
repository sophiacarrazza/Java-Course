package fundamentos;

public class Operadores {

    public static void main (String[] args){


        //artiméticos
        var x = 4;
        var y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x / (double) y);
        System.out.println(x % y);
        System.out.println(Math.pow(x, y));

        int a = 6 * (3 + 2);
        int b = (int) Math.pow(a,2);
        int c = b / (3*2);

        int d = ((1-5) * (2-7))/2;
        int e = (int) Math.pow(d,2);
        int f = c - e;

        int g = ( (int) Math.pow(f, 3))/ ( (int) Math.pow(10, 3));
        System.out.println(g);

        //lógicos
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2); // ou exclusivo (xor)
        System.out.println(!!condicao1); // true
        System.out.println(!condicao2);

        //relacionais
        int h = 97;
        int i = 'h';
        System.out.println(h == i); //true
        // <, < , >=, <=, !=

        //atribuicao
        int j = h + i;
        j += i;
        j -= i;
        j *= i;
        j /= i;
        j %= 2;
        System.out.println(j);

        //unários
        j++;
        j--;
        ++j;
        --j;

        int w = 1, z = 2;
        System.out.println(++w == z--); // o ++w incrementa o valor da variável antes d comparar

        //ternário
        double media = 7.6;
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        //se media for >= 7.0, a string é Aprovado; Se não, é reprovado.
        System.out.println(resultado);

    }
}
