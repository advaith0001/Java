public class adding{
    public int add(int a,int b){
        return a+b;

    }

    public  double add(double a,double b){
        return a+b;

    }
    public int add(int a ,int b,int c){

        return a+b+c;
    }

    public static void main(String [ ] args){
        adding calculator= new adding();
        int sum1=calculator.add(10,8);
        System.out.println( "the sum1 is :"+sum1);

        double sum2=calculator.add(5.7,2.7);
        System.out.println("the sum2 is :"+sum2);

        int sum3 = calculator.add(12,13,5);
        System.out.println("the sum3 is "+sum3);





    }


}