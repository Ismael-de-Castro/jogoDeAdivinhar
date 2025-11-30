import java.util.Random;
import java.util.Scanner;

public class jogoAdvinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int[] palpites = new int[10];
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (tentativas < 10 && !acertou) {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            palpites[tentativas] = palpite;
            tentativas++;

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é MAIOR que " + palpite);
            } else {
                System.out.println("O número é MENOR que " + palpite);
            }
        }

        if (acertou) {
            System.out.println("Você venceu em " + tentativas + " tentativas!");
        } else {
            System.out.println("Você perdeu! O número era: " + numeroSecreto);
        }

        System.out.print("Seus palpites foram: ");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(palpites[i] + " ");
        }

        scanner.close();
    }
}
