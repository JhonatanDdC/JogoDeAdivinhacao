import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int maxNumero;
        int maxTentativas;

        System.out.println("Escolha a sua dificuldade:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");
        System.out.print("---> ");
        int dificuldade = in.nextInt();

        switch(dificuldade){
            case 1:
                maxNumero = 50;
                maxTentativas = 10;
                break;

            case 2:
                maxNumero = 75;
                maxTentativas = 5;
                break;

            case 3:
                maxNumero = 100;
                maxTentativas = 3;
                break;

            default:
                System.out.println("Opção inválida! Vamos para o nível médio!");
                maxNumero = 75;
                maxTentativas = 5;
        }

        int numeroSecreto = random.nextInt(maxNumero) + 1;
        int tentativa;
        int contadorTentativa = 0;

        System.out.println("==== Jogo de Adivinhação ====");
        System.out.println("Objetivo: Acertar o número de 1 a " + maxNumero);
        System.out.println("Você tem " + maxTentativas + " tentativas!");

        do {
            System.out.print("\nDigite sua tentativa: ");
            tentativa = in.nextInt();
            contadorTentativa++;

            if (tentativa > numeroSecreto){
                System.out.println("O número é menor!");
            } else if (tentativa < numeroSecreto){
                System.out.println("O número é maior!");
            } else {
                System.out.println("\nVocê acertou!");
                break;
            }
            System.out.println("\nTentativas restantes: " + (maxTentativas - contadorTentativa));

        } while (contadorTentativa < maxTentativas);

        if (tentativa != numeroSecreto){
            System.out.println("\nVocê perdeu!");
            System.out.println("O número correto era: " + numeroSecreto);
        }

        in.close();
    }
}
