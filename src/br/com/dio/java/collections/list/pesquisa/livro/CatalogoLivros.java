package br.com.dio.java.collections.list.pesquisa.livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaAutores = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listaAutores.add(livro);
                }
            }
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }

        return listaAutores;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaLivrosPorAno = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    listaLivrosPorAno.add(livro);
                }
            }
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }

        return listaLivrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!listaLivros.isEmpty()) {
            for (Livro livros : listaLivros) {
                if (livros.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livros;
                    break;
                }
            }
        } else {
            throw new RuntimeException("ERRO! A Lista está vazia!");
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        System.out.println("\n********** Livros **********\n");
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter", "Guru", 2005);
        catalogoLivros.adicionarLivro("Harry Potter", "Guru", 2004);
        catalogoLivros.adicionarLivro("Animais Fantásticos", "Giovanna", 2007);
        catalogoLivros.adicionarLivro("Scrum", "Jeff Sutherland", 2011);
        catalogoLivros.adicionarLivro("Java", "Leonardo", 2023);

        System.out.println("Pesquisar por Autor: " + catalogoLivros.pesquisarPorAutor("Guru"));

        System.out.println("\nPesquisar por Intervalo de Anos: " + catalogoLivros.pesquisarPorIntervaloAnos(2004, 2007));

        System.out.println("\nPesquisar por Título: " + catalogoLivros.pesquisarPorTitulo("Harry Potter"));
    }
}