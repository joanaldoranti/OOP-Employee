import java.util.ArrayList;
import java.util.List;

public class Company {
    private static List<Employee> employeeList;

    public Company() {
        this.employeeList = new ArrayList<>();
    }

    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("\nEmployee " + employee.getName() + " Added.");
    }

    public static double calculateTotalBonus(){
        double totalBonus = 0.0;
        for (Employee employee : employeeList) {
            totalBonus += employee.calculateBonus();
        }
        return totalBonus;
    }

    public static void showEmployeeDetails() {
        System.out.println("\nEmployee Detail : ");
        employeeList.forEach(Employee::getInfo);
    }
}
