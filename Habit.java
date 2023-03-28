public class Habit {
    private String name;
    private String description;
    private int totalCompletions;
    private int successfulCompletions;
    private int completionCount;
    private double successPercentage;
    
    public Habit(String name, String description) {
        this.name = name; // so that it can be set to the value passed in as a
        this.description = description;
        this.totalCompletions = 0;
        this.successfulCompletions = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getTotalCompletions() {
        return totalCompletions;
    }
    
    public int getSuccessfulCompletions() {
        return successfulCompletions;
    }
    
    public void fail(boolean successful) {
        if (!successful) {
            successfulCompletions--;
        }
    }

    public void setSuccess(double successPercentage2) {
        if (successPercentage > 1) {
            completionCount++;
        }
        successPercentage = (double) completionCount / totalAttempts() * 100;
    }

    public int totalAttempts() {
        return completionCount + (int) (100 - successPercentage);
    }
    
    public void completeSuccessfully() {
        successfulCompletions++;
        totalCompletions++;
    }
    
    public double getSuccessPercentage() {
        if (totalCompletions == 0) {
            return 0.0;
        }
        return ((double)successfulCompletions / (double)totalCompletions) * 100.0;
    }

    
}