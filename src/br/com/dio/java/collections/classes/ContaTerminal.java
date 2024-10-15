package br.com.dio.java.collections.classes;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*****************************");
        System.out.println("Por favor, digite seu Número:");
        int numeroConta = scanner.nextInt();

        System.out.println("\nPor favor, digite o número da sua Agência");
        int numeroAgencia = scanner.nextInt();

        System.out.println("\nPor favor, digite o seu Nome");
        String nomeCliente = scanner.next();

        System.out.println("\nPor favor, digite seu Saldo");
        double saldoConta = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, " +
                "conta %d e seu saldo de R$ %f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoConta);
    }
}