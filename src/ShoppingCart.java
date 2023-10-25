
import java.util.Scanner;

public class ShoppingCart {


	public static void main(String[]args) {
		
		String choice;
		Boolean c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Store! \nWhat would you like to put in your Shopping Cart?");

		System.out.println("Please type PUBLICATION, FOOD, or OTHER: ");
		choice = keyboard.nextLine();

		if (choice == "publications") {
			c = true;
			if (c = true) {
				pubs();
			}
		}
		
	}
	
	public static void pubs() {
		Scanner keyboard = new Scanner(System.in);
		String[] arroy = new String[8];
		arroy[4] = " the name of author: ";
		arroy[5] = "the published month:"; 
		arroy[6] = "the number of pages:";
		int p;
		for (int i=0;i<3;i++) {
			System.out.println("Please input " +arroy[i+5]);
			arroy[i] = keyboard.nextLine();
			if (i == 2) {
				break;
			}
		}
		System.out.println("Input number of pages");
		p = keyboard.nextInt();
		
		Publication pub = new Publication(arroy[0], arroy[1], p);

	}
}
