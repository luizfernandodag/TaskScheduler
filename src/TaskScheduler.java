import java.util.ArrayList;
import java.util.List;

import model.Task;

public class TaskScheduler {

    private List<Task> tasks;

    public TaskScheduler() {
        this.tasks = new ArrayList<Task> ();;
    }

    public void addTask(Task task)
    {
        this.tasks.add(task);

    }
    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(taskName));
    }

    public void executeTasks() {
        // For demonstration, we will just print the tasks
        System.out.println("Executing tasks:");
        for (Task task : tasks) {
            System.out.println("Task: " + task.getName() + " at " + task.getExecutionTime());
            // Here you would add logic to check if the task is due to be executed
        }
    }
    public List<Task> listTasks() {
        return tasks;
    }

    
    

}
