import  java.util.Scanner;

public class Arithemetic {
    public static void main (String [] args){
         Scanner scanner = new Scanner (System.in);

         double price;
         int quantity;
         char currency= '$';
         String itemName;
         double total;

        System.out.println("enter the item name :");
        itemName = scanner.nextLine();

        System.out.println("enter the price :");
        price = scanner.nextDouble();

        System.out.println("Enter the quantity :");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.print("the total amount is ;"+currency+total);





         scanner.close();


    }


}
