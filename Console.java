import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Company Company = new Company();
        Scanner scan = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("\nWelcome to the Employee Management System");
            System.out.println("1. Add an employee");
            System.out.println("2. Show all employee details");
            System.out.println("3. Calculate total bonus");
            System.out.println("4. Exit");

            try {
                System.out.println("Enter choice : ");
                choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\nEmployee type :");
                        System.out.println("1. Manager");
                        System.out.println("2. Developer");
                        System.out.println("3. Intern");
                        System.out.println("Enter choice : ");
                        int type = scan.nextInt();
                        scan.nextLine();

                        if (type == 1) {
                            System.out.println("\nEnter name : ");
                            String name = scan.nextLine();
                            System.out.println("Enter employee ID : ");
                            String employeeID = scan.nextLine();
                            System.out.println("Enter salary : ");
                            double salary = scan.nextDouble();
                            scan.nextLine();

                            System.out.println("Enter team size : ");
                            int teamSize = Integer.parseInt(scan.nextLine());
                            scan.nextLine();
                            Company.addEmployee(new Manager(name, employeeID, salary, teamSize));
                        } else if (type == 2) {
                            System.out.println("\nEnter name : ");
                            String name = scan.nextLine();
                            System.out.println("Enter employee ID : ");
                            String employeeID = scan.nextLine();
                            System.out.println("Enter salary : ");
                            double salary = scan.nextDouble();
                            scan.nextLine();

                            System.out.println("Enter programming language : ");
                            String programmingLanguage = scan.nextLine();
                            scan.nextLine();
                            Company.addEmployee(new Developer(name, employeeID, salary, programmingLanguage));
                        } else if (type == 3) {
                            System.out.println("\nEnter name : ");
                            String name = scan.nextLine();
                            System.out.println("Enter employee ID : ");
                            String employeeID = scan.nextLine();
                            System.out.println("Enter salary : ");
                            double salary = scan.nextDouble();
                            scan.nextLine();

                            System.out.println("Enter school name : ");
                            String schoolName = scan.nextLine();
                            System.out.println("Enter internship duration : ");
                            int duration = Integer.parseInt(scan.nextLine());
                            scan.nextLine();
                            Company.addEmployee(new Intern(name, employeeID, salary, schoolName, duration));
                        } else {
                            System.out.println("\nInvalid.");
                        }
                        break;
                    case 2:
                        Company.showEmployeeDetails();
                        break;
                    case 3:
                        double totalBonus = Company.calculateTotalBonus();
                        System.out.println("\nTotal bonus : " + totalBonus);
                        break;
                    case 4:
                        System.out.println("\nThank you.");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid Number.");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("\nInvalid Input.");
                scan.nextLine();
            }
        }
    }
}
