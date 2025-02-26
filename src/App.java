import com.sun.source.util.TaskListener;
import java.util.Scanner;

import model.Task;

public class App {
    public static void main(String[] args) throws Exception {
        TaskScheduler scheduler = new TaskScheduler();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Execute Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            
            if(choice ==  1)
            {
                    System.out.println("Enter task name:");
                    String name = scanner.nextLine();
                    
                    System.out.println("Enter execution time:");
                    String time = scanner.nextLine();
                    
                    System.out.println("Is it recurring? (treu/false):");
                    boolean isRecurring = scanner.nextBoolean();

                    scheduler.addTask(new Task(name, time, isRecurring));

            }
            else if(choice ==  2)
            {
                System.out.println("Enter the name of the task to remove:");
                String taskToRemove = scanner.nextLine();
                scheduler.removeTask(taskToRemove);
                System.out.println("task remove");

            }
            else if(choice ==  3)
            {
                scheduler.executeTasks();
                    
            }
            else if (choice == 4) {
                System.out.println("Current Tasks:");

                for(Task t: scheduler.listTasks())
                {
                    System.out.println("Task: " + t.getName());
                }
                
            }
            else if(choice ==  5)
            {
                break;

            }
            else
            {
                System.out.println("Invalid Option. Try again.");


            }

                  
            }

        }


        
    }

