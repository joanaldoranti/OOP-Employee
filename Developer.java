public class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Developer(String name, String employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return (getSalary() * 0.15);
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Programming language : " + programmingLanguage);
        System.out.println("Bonus : " +calculateBonus() );
    }
}