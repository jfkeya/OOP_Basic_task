public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public double calculateIncreasedSalary(double percentage) {
        return salary + (salary * percentage / 100);
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated to: " + this.salary);
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Software Engineer", 50000);
        emp.displayInfo();
        double increasedSalary = emp.calculateIncreasedSalary(10); // 10% increase
        emp.updateSalary(increasedSalary);
        emp.displayInfo();
    }
}
