package solution;

public class Task {
    private String name;
    private double workingHours;

    public Task(String name, double workingHours) {
        setName(name);
        setWorkingHours(workingHours);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    double getWorkingHours() {
        return workingHours;
    }

    void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            System.out.println("Working hours should be positive number");
        } else {
            this.workingHours = workingHours;
        }
    }
}
