public class ParametrosInvalidosException extends Exception {
    
    
    public ParametrosInvalidosException(String mensagemString){
        super("O segundo parâmetro deve ser maior que o primeiro!!!!");
    }

}
