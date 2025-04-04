// Criamos uma exceção personalizada que herda de Exception
public class ParametrosInvalidosException extends Exception{

    // Construtor que repassa a mensagem de erro para a superclasse Exception
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
