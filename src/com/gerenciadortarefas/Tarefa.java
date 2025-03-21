package com.gerenciadortarefas;

public class Tarefa implements ITarefa {
    private final String descricao; // Descrição da tarefa
    private boolean concluida; // Indica se a tarefa foi concluída


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // Tarefa inicia como não concluída
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean isConcluida() {
        return false;
    }

    @Override
    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " - " + (concluida ? "Concluída" : "Pendente");
    }
}