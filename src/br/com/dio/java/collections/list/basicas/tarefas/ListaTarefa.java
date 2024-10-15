package br.com.dio.java.collections.list.basicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adiconarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefas : listaTarefas) {
            if (tarefas.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefas);
            }
        }

        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(listaTarefas);
    }

    // Main
    public static void main(String[] args) {
        System.out.println("\n********** List **********");
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de Tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\n******* Adicionando ******");
        listaTarefa.adiconarTarefa("Tarefa 1");
        listaTarefa.adiconarTarefa("Tarefa 1");
        listaTarefa.adiconarTarefa("Tarefa 2");
        System.out.println("Número total de Tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\n******** Removendo ********");
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Número total de Tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("\n******** Listando ********");
        listaTarefa.obterDescricaoTarefas();
    }
}