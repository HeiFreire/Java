
import java.util.*;

public class cinema {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        
        int salaalpha, salabeta, filmes1, filmes2, fileirasA, fileirasB, lugares;
        salaalpha = 1;
        salabeta = 2;

        System.out.print("\nBem Vindo ao cinema Omega");
        System.out.print("\nHá dois filmes disponíveis: As Branquelas e A Chegada");
        System.out.print("\nEscolha um dos filmes pressionando um dos números:\n1. As Branquelas\n2. A Chegada\n");
        int filmes = leitor.nextInt();

        if (filmes == 1) {
         salaalpha = fileirasA = 6; lugares = 140;
         int fileiraAA, fileiraAB, fileiraAC, fileiraAD, fileiraAE, fileiraAF;
         int assentonormal, assentodeficiente;
         System.out.print("\nGostaria de um acento exclusivo para deficientes?\n1. Sim\n2. Não\n");
         int escolha = leitor.nextInt();

           if (escolha = 1) {
               (assentodeficiente = 8);
               System.out.print("\nTemos 8 assentos disponíveis, escolha um do painel");
               assentodeficiente = leitor.nextInt();
               System.out.print("\nEscolha bem sucedida.");
           }
           else (escolha = 2) {
               (lugares = 140) (fileiras = 6);
               System.out.print("Temos 140 assentos, sendo eles separados por 6 fileiras, onde 2 contem 24 assentos e 4 23. Por favor, escolha a fileira desejada\n 1.A\n2.B\n3.C\n4.D\n5.E\n6.F\n");
                int fileiras = leitor.nextInt();
                if (fileiras = 1) {
                    System.out.print("\nHá 24 assentos disponíveis, escolha um de 1 até 24.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
                if (fileiras = 2) {
                    System.out.print("\nHá 24 assentos disponíveis, escolha um de 25 até 48.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
                if (fileiras = 3) {
                    System.out.print("\nHá 23 assentos disponíveis, escolha um de 49 até 71.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
                if (fileiras = 4) {
                    System.out.print("\nHá 23 assentos disponíveis, escolha um de 72 até 94.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
                if (fileiras = 5) {
                    System.out.print("\nHá 23 assentos disponíveis, escolha um de 95 até 117.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
                else (fileiras = 6) {
                    System.out.print("\nHá 20 assentos disponíveis, escolha um de 118 até 140.\n");
                    int assentos = leitor.nextInt();
                    System.out.print("\nEscolha bem sucedida, tenha um bom filme.");
                }
            }
        }
    }
}
