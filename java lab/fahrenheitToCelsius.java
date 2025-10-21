import java.util.Scanner;

public class fahrenheitToCelsius{

	public static void main (String [] args){


		Scanner sc = new Scanner(System.in);

		System.out.print("enter the fahrenheit :");

		double fahrenheit = sc.nextDouble();

		double celsius = ((fahrenheit - 32)*5/9);

		System.out.println("the celsius value is : " +celsius);

		sc.close();
}

	


}