public class Intern extends Employee {
    private String schoolName;
    private int internshipDuration;

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Intern(String name, String EmployeeID, double salary, String schoolName, int internshipDuration) {
        super(name, EmployeeID, salary);
        this.schoolName = schoolName;
        this.internshipDuration = internshipDuration;
    }

    @Override
    public double calculateBonus() {
        return (internshipDuration * 100000);
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("School name : " + schoolName);
        System.out.println("Internship duration : " + internshipDuration);
        System.out.println("Bonus : " + calculateBonus());
    }
}
