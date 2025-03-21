package com.gerenciadortarefas;

public interface ITarefa {
    String getDescricao();
    boolean isConcluida();
    void marcarComoConcluida();
    String toString();

}
