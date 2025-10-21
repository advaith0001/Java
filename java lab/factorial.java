
import java.util.Scanner;

public class factorial{

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the number :");

		int number = sc.nextInt();
		int fact=1;

		for(int i=1;i<number+1;i++){

			fact= fact * i;

			

		


		
}

		System.out.println("factorial of the give n number is :"+fact);	

	


}

}