package com.gerenciadortarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas(); // Cria um gerenciador de tarefas
        Scanner scanner = new Scanner(System.in); // Cria um scanner para entrada do usuário

        int opcao;
        while (true) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        gerenciador.adicionarTarefa(new Tarefa(descricao)); // Adiciona a tarefa ao gerenciador
                        break;
                    case 2:
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        gerenciador.removerTarefa(indiceRemover - 1); // Remove a tarefa do gerenciador
                        break;
                    case 3:
                        System.out.print("Digite o número da tarefa a ser marcada como concluída: ");
                        int indiceConcluir = scanner.nextInt();
                        scanner.nextLine(); // Consome a nova linha
                        System.out.print("Digite a data de conclusão (dd/MM/yyyy): ");
                        String dataConclusao = scanner.nextLine();
                        gerenciador.marcarTarefaComoConcluida(indiceConcluir - 1, dataConclusao); // Marca a tarefa como concluída
                        break;
                    case 4:
                        gerenciador.listarTarefas(); // Lista todas as tarefas
                        break;
                    case 0:
                        System.out.println("Saindo do gerenciador de tarefas...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                scanner.nextLine();
                opcao = -1;
            }

        }
    }
}