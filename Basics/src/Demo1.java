import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class calculator{
    int n;

    //instance method
    int square(int n ){
        return n*n;
    }
    //static method
    static int cube(int n){
        return n*n*n;
    }
}

public class Demo1 {

    public static void main (String []args){
        calculator calc = new calculator();
        System.out.println(calc.square(4));
        System.out.println(calculator.cube(3));

    }





}
