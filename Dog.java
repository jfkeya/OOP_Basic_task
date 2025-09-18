public class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Method to display dog details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    // Main method
    public static void main(String[] args) {
        // Create two Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Modify their attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        // Display updated dog details
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
