package model;

public class Task {

    private String name;
    private String executionTime;
    private boolean isRecurring;
    public Task(String name, String executionTime, boolean isRecurring) {
        this.name = name;
        this.executionTime = executionTime;
        this.isRecurring = isRecurring;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExecutionTime() {
        return executionTime;
    }
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }
    public boolean isRecurring() {
        return isRecurring;
    }
    public void setRecurring(boolean isRecurring) {
        this.isRecurring = isRecurring;
    };

    public static void main(String[] args) {
        System.out.println("OI");
    }
    

}
