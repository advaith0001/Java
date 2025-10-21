public class Car {

    String brand;
    String model;

    public Car(){
        this.brand = "unknown";
        this.model="unknown";

    }

    public Car (String brand,String model){
        this.brand=brand;
        this.model=model;

    }

    public void result (){
        System.out.println("the band is :"+brand);
        System.out.print("enter the model:"+model);
    }
    public static void main(String [] args){
        Car careOne=new Car("toyota","barnd");
        careOne.result();

    }
}
