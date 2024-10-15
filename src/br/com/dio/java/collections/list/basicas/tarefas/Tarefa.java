package br.com.dio.java.collections.list.basicas.tarefas;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao();
    }

    public String getDescricao() {
        return descricao;
    }
}