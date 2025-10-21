public class BoxMain {
    private double width;
    private double height;

    // Default constructor
    public BoxMain() {
        width = 0;
        height = 0;
    }

    // Parameterized constructor
    public BoxMain(double w, double h) {
        width = w;
        height = h;
    }

    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {

        BoxMain b1 = new BoxMain();    // Uses default constructor

        BoxMain b2 = new BoxMain(3.4, 5.2);//parameterized constructor

        b1.display();
        b2.display();
    }

}

