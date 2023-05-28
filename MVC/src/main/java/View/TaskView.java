package View;

import java.util.List;
import java.util.Scanner;
import Model.*;

public class TaskView {
    private final Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("===== Gerenciador de Tarefas =====");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Exibir tarefas");
        System.out.println("3. Remover tarefa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Task createTask() {
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome da tarefa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        return new Task(nome, descricao);
    }

    public void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Não há tarefas para exibir.");
        } else {
            System.out.println("===== Lista de Tarefas =====");
            for (Task task : tasks) {
                System.out.println("Nome: " + task.getNome());
                System.out.println("Descrição: " + task.getDescricao());
                System.out.println("-----------------------------");
            }
        }
    }

    public int getTaskIndex() {
        System.out.print("Digite o índice da tarefa a ser removida: ");
        return scanner.nextInt();
    }
}

