package excecao;

//serialização = transformar um objeto de java em um texto
@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está negativo," +
                nomeDoAtributo);
    }
}
