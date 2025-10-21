class overloading{

    int adding ( int a ,int b){
        return a+b;
    }
    double adding (double a ,double b){
        return a+b;
    }
}


public class methodOverloading {
    public static void main(String []args){
        overloading demo1=new overloading();
        System.out.println("added number sum is "+demo1.adding(2.5,6.6));
    }
}
