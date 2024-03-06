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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Questão 1
        System.out.println("Questão 1:");
        questaoUm();
        System.out.println();


        scanner.close();
    }
}
