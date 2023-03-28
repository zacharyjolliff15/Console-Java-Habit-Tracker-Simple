import java.util.ArrayList;

public class HabitTracker {
    private ArrayList<Habit> habits;
    
    public HabitTracker() {
        this.habits = new ArrayList<Habit>();
    }
    
    public void addHabit(Habit habit) {
        habits.add(habit);
    }
    
    public void completeHabit(String name, boolean success) {
        for (Habit habit : habits) {
            if (habit.getName().equals(name)) {
                if (success) {
                    habit.completeSuccessfully();
                } else {
                    habit.fail(success);
                }
                break;
            }
        }
    }
    
    public void updateHabitSuccessPercentage(String name, double successPercentage) {
        for (Habit habit : habits) {
            if (habit.getName().equals(name)) {
                habit.setSuccess(successPercentage);
                break;
            }
        }
    }
    
    public void displayAllHabits() {
        for (Habit habit : habits) {
            System.out.println("Habit: " + habit.getName());
            System.out.println("Description: " + habit.getDescription());
            System.out.println("Total Completions: " + habit.getTotalCompletions());
            System.out.println("Successful Completions: " + habit.getSuccessfulCompletions());
            System.out.println("Success Percentage: " + habit.getSuccessPercentage() + "%");
            System.out.println();
        }
    }
}