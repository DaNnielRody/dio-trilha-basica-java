package edu.dan.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        int agencyNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String clientName = scanner.nextLine();

        System.out.println("Digite a sua Agência: ");
        String agency = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!%nSua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque", clientName, agency, agencyNumber, balance);
    }
}