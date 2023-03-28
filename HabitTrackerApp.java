import java.util.Scanner;

public class HabitTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HabitTracker habitTracker = new HabitTracker();
        
        while (true) {
            System.out.println("1. Add new habit");
            System.out.println("2. Complete habit");
            System.out.println("3. Display all habits");
            System.out.println("4. Quit");
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter habit name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter habit description: ");
                    String description = scanner.nextLine();
                    Habit habit = new Habit(name, description);
                    habitTracker.addHabit(habit);
                    System.out.println("Habit added.");
                    break;
                case 2:
                    System.out.print("Enter habit name: ");
                    String habitName = scanner.nextLine();
                    System.out.print("Was the habit completed successfully? (y/n): ");
                    String YorN = scanner.nextLine();
                    boolean successful = false;
                    if (YorN.equalsIgnoreCase("y")) {
                        successful = true;
                    }
                    habitTracker.completeHabit(habitName, successful);
                    System.out.println("Habit completed.");
                    break;
                case 3:
                    habitTracker.displayAllHabits();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}