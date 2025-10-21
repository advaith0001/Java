import java.util.Scanner;

public class swap{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);


		System.out.print("enter the number (a):");

		int a = sc.nextInt();

		System.out.print("enter the number (b): ");

		int b = sc.nextInt();

		int temp= a;
		
		a=b;

		b= temp;

		System.out.println("After swapping value of a is :"+a);

		System.out.println("value of b is :"+b);

		sc.close();

		



}


}