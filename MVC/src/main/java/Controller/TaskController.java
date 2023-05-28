package Controller;

import View.*;
import Model.*;

import java.util.List;

public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(Task task) {
        model.addTask(task);
    }

    public void removeTask(int index) {
        List<Task> tasks = model.getTasks();
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            model.removeTask(task);
            System.out.println("Tarefa removida: " + task.getNome());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public List<Task> getTasks() {
        return model.getTasks();
    }

    public void showTasks() {
        List<Task> tasks = getTasks();
        view.displayTasks(tasks);
    }

    public void run() {
        int opcao;
        do {
            opcao = view.showMenu();
            switch (opcao) {
                case 1:
                    Task task = view.createTask();
                    addTask(task);
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    int index = view.getTaskIndex();
                    removeTask(index);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }
}

