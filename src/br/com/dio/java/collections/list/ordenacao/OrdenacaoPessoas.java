package br.com.dio.java.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas  {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }
}