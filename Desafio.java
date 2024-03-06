import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    // Questão 1
    public static void questaoUm() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }

    // Questão 2
    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificaFibonacci(int numero, List<Integer> fibonacci) {
        for (int fib : fibonacci) {
            if (fib == numero)
                return true;
        }
        return false;
    }

    // Questão 5
    public static String inverteString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Questão 1
        System.out.println("Questão 1:");
        questaoUm();
        System.out.println();

        
        // Questão 2
        System.out.println("Questão 2:");
         // Inicializa a sequência de Fibonacci com os dois primeiros números
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        // Solicita ao usuário um número para verificar na sequência de Fibonacci
        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Calcula e armazena os números da sequência de Fibonacci até encontrar o número fornecido
        while (fibonacci.get(fibonacci.size() - 1) < numero) {
            int ultimo = fibonacci.get(fibonacci.size() - 1);
            int penultimo = fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(ultimo + penultimo);
        }

        // Verifica se o número fornecido pertence à sequência de Fibonacci
        if (verificaFibonacci(numero, fibonacci)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            System.out.println("Sequência de Fibonacci até " + numero + ": " + fibonacci);
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            System.out.println("Sequência de Fibonacci até " + numero + ": " + fibonacci);
        }

        // Questão 5
        System.out.println("Questão 5:");
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.next();
        System.out.println("String invertida: " + inverteString(entrada));


        scanner.close();
    }
}
