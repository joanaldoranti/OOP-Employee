public class Manager extends Employee {
    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }

    public Manager(String name, String employeeID, double salary, int teamSize) {
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return (getSalary() * 0.2) + (teamSize * 500000);
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Team size : " + teamSize);
        System.out.println("Bonus : " + calculateBonus());
    }
}
