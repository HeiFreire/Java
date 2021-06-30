import java.util.*;
public class ContaDeBanco {
    
    public static void main(String[] args) {
    String nome;
    String agencia;
    int numerodaconta;
    String datadeabertura;
    double saldodisponivel;

    Scanner leia = new Scanner(System.in);
    System.out.print("Escolha uma opção\n1. Visualizar Saldo\n2. Sacar Saldo\n3. Depositar\n4. Rendimento");
    int escolha = leia.nextInt();

    if (escolha = 1) {
       System.out.print("Seu saldo é " saldodisponivel"."); 

    }
    if (escolha = 2) {
        System.out.print("Digite o valor a ser sacado: ");
        int saldoemsaque = leia.nextInt();
        System.out.println("Saque efetuado com sucesso.");
    
    }
    else if (escolha = 3) {
        System.out.print("Digite o valor a ser depositado: ");
        int deposito = leia.nextInt();
        System.out.println("Depósuto efetuado com sucesso, verifique o recibo pelo email.");
    }
    else (escolha = 4) {
    //?????????????
    }    
}

//Яблако