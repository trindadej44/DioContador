import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        // Leitura dos parâmetros
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Leitura do primeiro número
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Leitura do segundo número
        
        try {
            // Chama o método que realiza a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de exceção
            System.out.println(e.getMessage());
        }
        
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é maior que parametroDois e lança a exceção se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;
        
        // Loop para imprimir as mensagens
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

