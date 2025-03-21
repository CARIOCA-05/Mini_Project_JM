package com.gerenciadortarefas;

/**
 * Classe que representa uma tarefa concluída, estendendo a classe Tarefa.
 */
public class TarefaConcluida extends Tarefa {
    private final String dataConclusao; // Data em que a tarefa foi concluída

    /**
     * Construtor da classe TarefaConcluida.
     *
     * @param descricao     A descrição da tarefa.
     * @param dataConclusao A data em que a tarefa foi concluída.
     */
    public TarefaConcluida(String descricao, String dataConclusao) {
        super(descricao); // Chama o construtor da classe pai (Tarefa)
        this.dataConclusao = dataConclusao;
        marcarComoConcluida(); // Marca a tarefa como concluída
    }

    /**
     * Retorna uma representação em String da tarefa concluída.
     *
     * @return Uma string formatada com a descrição, status e data de conclusão da tarefa.
     */
    @Override
    public String toString() {
        return super.toString() + " - Concluída em: " + dataConclusao;
    }
}
