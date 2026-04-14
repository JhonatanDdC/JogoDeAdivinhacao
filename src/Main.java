import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int contadorTentativa = 0;

        System.out.println("==== Jogo de Adivinhação ====");
        System.out.println("Objetivo: Acertar o número de 1 a 100");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = in.nextInt();
            contadorTentativa++;

            if (tentativa > numeroSecreto){
                System.out.println("O número é menor!");
            } else if (tentativa < numeroSecreto){
                System.out.println("O número é maior!");
            } else {
                System.out.println("Você acertou!");
            }


        } while (tentativa != numeroSecreto);

        System.out.println("Você utilizou " + contadorTentativa + " tentativas!");

        in.close();
    }
}
