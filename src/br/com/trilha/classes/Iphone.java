package br.com.trilha.classes;

import br.com.trilha.model.AparelhoTelefonico;
import br.com.trilha.model.NavegadorInternet;
import br.com.trilha.model.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("O Iphone está tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("O Iphone pausou a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("O Iphone está selecionando a música!");
    }

    @Override
    public void ligar() {
        System.out.println("O Iphone está ligando para uma pessoa!");
    }

    @Override
    public void atender() {
        System.out.println("O Iphone vai atender a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O Iphone está iniciando o correio de Voz!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("O Iphone está exibindo uma página na internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O Iphone está adicionando uma nova aba da internet!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O Iphone está atualizando a página");
    }
}