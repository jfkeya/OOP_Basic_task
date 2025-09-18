public class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Print area and perimeter
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
