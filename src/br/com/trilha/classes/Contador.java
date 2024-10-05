package br.com.trilha.classes;

import br.com.trilha.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("\n****************************");
        System.out.println("Digite o primeiro Número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo Número: ");
        int parametroDois = terminal.nextInt();

        try {
            contarNumeros(parametroUm, parametroDois);
        } catch (Exception ex) {
            throw new ParametrosInvalidosException("ERRO! O primeiro número não pode ser maior que o segundo número!", ex);
        }
    }

    static void contarNumeros(int numeroUm, int numeroDois) throws ParametrosInvalidosException {

        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException("ERRO! O primeiro número não pode ser maior que o segundo número!");
        }

        int contagem = numeroDois - numeroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}