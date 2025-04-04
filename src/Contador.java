import java.util.Scanner;  // Importa a classe Scanner para entrada de dados

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário

         // Solicita o primeiro número ao usuário
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiro_parâmetro = sc.nextInt(); // Lê o primeiro número digitado pelo usuário

        // Solicita o segundo número ao usuário
        System.out.print("Digite o segundo parâmetro: ");
        int segundo_parâmetro = sc.nextInt(); // Lê o segundo número digitado pelo usuário

        try{
            // Chama o método que executa a lógica de verificação
            verificar(primeiro_parâmetro, segundo_parâmetro);

            // Chama o método que executa a lógica de contagem
            contar(primeiro_parâmetro, segundo_parâmetro);
        } catch(ParametrosInvalidosException parametrosInvalidos){
            // Se a exceção for lançada, exibe a mensagem de erro no console
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            // Fecha o Scanner para evitar consumo de recursos
            sc.close();
        }
    }

    //Método responsável para verificar qual número é maior
    static void verificar(int parâmetro1, int parâmetro2) throws ParametrosInvalidosException{
         // Verifica se o primeiro número é maior que o segundo
         
        if (parâmetro2 < parâmetro1) {
            // Lança a exceção personalizada caso a condição seja verdadeira
            throw new ParametrosInvalidosException();
        }
    }
    
    // Método responsável por realizar a contagem
    static void contar(int primeiro_parâmetro, int segundo_parâmetro) {
        // Calcula a quantidade de interações
        int ocorrencias = segundo_parâmetro-primeiro_parâmetro;

        // Loop que percorre de 1 até a quantidade de interações e imprime no console
        for (int i = 1; i <= ocorrencias; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}