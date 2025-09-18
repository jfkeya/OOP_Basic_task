import java.time.LocalDate;
import java.time.Period;

public class Employeee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employeee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public int getYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
    }

    // Main method
    public static void main(String[] args) {
        // Create an Employee object
        LocalDate hireDate = LocalDate.of(2018, 5, 20);  // YYYY-MM-DD
        Employeee emp = new Employeee("John Doe", 60000, hireDate);

        // Display employee info
        emp.displayInfo();
    }
}
