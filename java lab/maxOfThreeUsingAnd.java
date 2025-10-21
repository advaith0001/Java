import java.util.Scanner;

public class maxOfThreeUsingAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the value of (a) ");
        int a = sc.nextInt();

        System.out.print("Enter the value of (b) ");
        int b = sc.nextInt();

        System.out.print("Enter the value of (c)) ");
        int c = sc.nextInt();

        

        // Using AND (&&) operators
        if (a >= b && a >= c) {
            System.out.print(a+ "a is greater");
        } else if (b >= a && b >= c) {
            System.out.print(b+ "b is greater");
        } else {
            System.out.print(c+ " is greater");
        }

       

        sc.close();
    }
}
