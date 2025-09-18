import java.util.ArrayList;
public class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Course added: " + course);
        } else {
            System.out.println("Course already enrolled: " + course);
        }
    }
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }
    public void displayInfo() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses Enrolled: " + courses);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        student.addCourse("Math");
        student.removeCourse("Science");
        student.removeCourse("History");
        student.displayInfo();
    }
}
