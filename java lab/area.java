import java.util.Scanner;

public class area{

	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the length:");
		double length= sc.nextDouble();

		System.out.print("enter the breadth:");
		double breadth = sc.nextDouble();

		double Area=length*breadth;

		System.out.println("Area is :"+Area);

		double perimeter= 2*(length+breadth);


		System.out.println("perimeter is :"+perimeter);

		sc.close();


}

}