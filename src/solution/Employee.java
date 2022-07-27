package solution;

public class Employee {
    private final static String noWork = "The employee haven`t current task.";
    private String name;
    private Task task;
    private double hoursLeft;

    Employee(String name) {
        setName(name);
    }

    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    void setTask(Task task) {
        this.task = task;
    }

    double getHoursLeft() {
        return hoursLeft;
    }

    void setHoursLeft(double hoursLeft) {
        if (hoursLeft <= 0) {
            System.out.println("Working hours should be positive number");
        } else {
            this.hoursLeft = hoursLeft;
        }
    }

    void work() {
        if (!isNull(task)) {
            if (task.getWorkingHours() > hoursLeft) {
                task.setWorkingHours(task.getWorkingHours() - getHoursLeft());
                hoursLeft = 0;
            } else if (task.getWorkingHours() < hoursLeft) {
                hoursLeft -= task.getWorkingHours();
                task.setWorkingHours(0);
            } else {
                hoursLeft = 0;
                task.setWorkingHours(0);
            }
        } else {
            System.out.println(noWork);
        }
    }

    void showReport() {
        if (!isNull(task)) {
            print();
        }
        else {
            System.out.println(noWork);
        }
    }

    private boolean isNull(Task task) {
        return task == null;
    }

    private void print() {
        System.out.printf("Employee:%s\nTask:%s\nEmployee can work %.2f hours\nTask need %.2f hours to be finished",
                name, task.getName(), getHoursLeft(), task.getWorkingHours());
        System.out.println();
    }
}
