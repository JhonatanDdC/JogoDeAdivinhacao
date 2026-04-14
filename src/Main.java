import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int contadorTentativa = 0;
        int maxTentativas = 10;

        System.out.println("==== Jogo de Adivinhação ====");
        System.out.println("Objetivo: Acertar o número de 1 a 100");
        System.out.println("Você tem 10 tentativas!");

        do {
            System.out.print("\nDigite sua tentativa: ");
            tentativa = in.nextInt();
            contadorTentativa++;

            if (tentativa > numeroSecreto){
                System.out.println("O número é menor!");
            } else if (tentativa < numeroSecreto){
                System.out.println("O número é maior!");
            } else {
                System.out.println("Você acertou!");
                break;
            }
            System.out.println("\nTentativas restantes: " + (maxTentativas - contadorTentativa));

        } while (contadorTentativa < maxTentativas);

        if (tentativa != numeroSecreto){
            System.out.println("Você perdeu!");
            System.out.println("O número correto era: " + numeroSecreto);
        }

        in.close();
    }
}
