package com.gerenciadortarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<ITarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(ITarefa tarefa) {

        tarefas.add(tarefa);
    }

    public void removerTarefa(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        tarefas.remove(indice);
    }

    public void marcarTarefaComoConcluida(int indice, String dataConclusao) {
        if (indice < 0 || indice >= tarefas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        ITarefa tarefa = tarefas.get(indice);
        if (tarefa instanceof TarefaConcluida) {
            throw new IllegalStateException("Tarefa já está concluída.");
        }
        tarefas.set(indice, new TarefaConcluida(tarefa.getDescricao(), dataConclusao));
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}