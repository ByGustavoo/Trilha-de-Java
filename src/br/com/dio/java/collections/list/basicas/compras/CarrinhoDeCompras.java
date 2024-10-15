package br.com.dio.java.collections.list.basicas.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        if (!listaItens.isEmpty()) {
            for (Item itens : listaItens) {
                if (itens.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(itens);
                }
            }
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }

        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valortotal = 0d;

        if (!listaItens.isEmpty()) {
            for (Item item : listaItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valortotal += valorItem;
            }
            return valortotal;
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!listaItens.isEmpty()) {
            System.out.println(listaItens);
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }
    }

    // Main
    public static void main(String[] args) {
        System.out.println("\n********** Desafio 1 **********");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("\n******* Adicionando ******");
        carrinhoDeCompras.adicionarItem("Chocolate", 6.99, 10);
        carrinhoDeCompras.adicionarItem("Chocolate", 6.99, 10);
        carrinhoDeCompras.adicionarItem("Picanha", 129.99, 7);
        carrinhoDeCompras.adicionarItem("Refrigerante", 8.99, 15);
        System.out.println("Itens no Carrinho de Compras: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("\n******** Removendo ********");
        carrinhoDeCompras.removerItem("Chocolate");
        System.out.println("Valor total do Carrinho de Compras: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("\n******** Listando ********");
        carrinhoDeCompras.exibirItens();
    }
}