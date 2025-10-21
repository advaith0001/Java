public class Rectangle {

    int length;
    int breadth;



    public void setDimensions(int l, int b) {
        this.length = l;
        this.breadth = b;
        System.out.println("Dimensions set: Length = " + this.length + ", Breadth = " + this.breadth);
    }


    public int getPerimeter() {
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }


    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        System.out.println("Rectangle object created.");


        myRectangle.setDimensions(10, 5);


        int perimeterResult = myRectangle.getPerimeter();
        System.out.println("The perimeter of the rectangle is: " + perimeterResult);
    }
}