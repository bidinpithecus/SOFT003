package Model;

import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private final List<Task> tasks;

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public boolean hasTasks() {
        return !tasks.isEmpty();
    }
}