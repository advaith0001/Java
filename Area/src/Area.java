public class Area {

    double radius;
    double PI = 3.14;

    public  Area(double radius){

        this.radius=radius;
        System.out.println("initialized");
    }

    public  double calculateArea ( double radius){
        return PI * radius* radius;
    }

    public static  void main(String [] args){

        Area circle= new Area(2.2);
        double result=circle.calculateArea(2.2);
        System.out.println("the result is :"+result);

    }
}
