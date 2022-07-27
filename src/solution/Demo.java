package solution;

public class Demo {
    public static void main(String[] args) {
        Employee go6o = new Employee("Georgi");
        Task kopai = new Task("Izkopai rov",2);
        go6o.showReport();
        go6o.setTask(kopai);
        go6o.showReport();
        go6o.setHoursLeft(5);
        go6o.showReport();
        go6o.work();
        go6o.showReport();
        go6o.setHoursLeft(6);

    }
}
