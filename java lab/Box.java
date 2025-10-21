// Box.java
public class Box {
    private double width;
    private double height;

    // Default constructor
    public Box() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    public Box(double w, double h) {
        width = w;
        height = h;
    }

    // Method to display width and height
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}



