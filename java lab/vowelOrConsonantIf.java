import java.util.Scanner;

public class vowelOrConsonantIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); // Convert to lowercase

        // Check if it's a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Not a letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        sc.close();
    }
}
