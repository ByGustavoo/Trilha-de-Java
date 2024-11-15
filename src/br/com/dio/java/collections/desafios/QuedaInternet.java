package br.com.dio.java.collections.desafios;

import java.util.List;
import java.util.Scanner;

public class QuedaInternet {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {

        List<String> velocidadesList = List.of(velocidades);

        if (velocidadesList.stream().anyMatch(velocidade -> Integer.parseInt(velocidade) == 0)) {
            return "Queda de Conexao";
        } else {
            return "Sem Quedas";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}