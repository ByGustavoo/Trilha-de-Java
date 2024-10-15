package br.com.dio.java.collections.list.pesquisa.numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;

        if (!listaNumeros.isEmpty()) {
            for (Integer numeros : listaNumeros) {
                somaTotal += numeros;
            }
        } else {
            throw new RuntimeException("ERRO! A Lista de Números está vazia!");
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        Collections.sort(listaNumeros);

        int maiorNumero =  listaNumeros.size() - 1;

        return listaNumeros.get(maiorNumero);
    }

    public int encontrarMenorNumero() {
        Collections.reverse(listaNumeros);

        int menorNumero =  listaNumeros.size() - 1;

        return listaNumeros.get(menorNumero);
    }

    public List<Integer> exibirNumeros() {
        Collections.sort(listaNumeros);
        return listaNumeros;
    }

    @Override
    public String toString() {
        return "Lista dos Números: " + listaNumeros;
    }

    public static void main(String[] args) {
        System.out.println("\n*********** List ***********\n");
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(19);
        somaNumeros.adicionarNumero(27);
        somaNumeros.adicionarNumero(69);
        somaNumeros.adicionarNumero(9);

        System.out.println("Soma da Lista de Números: " + somaNumeros.calcularSoma());

        System.out.println("Maior Número da Lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor Número da Lista: " + somaNumeros.encontrarMenorNumero());

        System.out.println("Lista de Números: " + somaNumeros.exibirNumeros());

        System.out.println("\n****************************\n");
    }
}