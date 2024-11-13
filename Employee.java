public class Employee {
    private String name;
    private String employeeID;
    private double salary;

    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return 0;
    }

    public void getInfo() {
        System.out.println("\nEmployee name : " + name);
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Salary : " + salary);
    }
}
