
import java.util.Scanner;

public class ShoppingCart {

	static String[] book_name = new String[150];
	static double[] book_price = new double[15];
	static String[] food_name = new String[150];
	static double[] food_price = new double[15];
	static String[] other_name = new String[150];
	static double[] other_price = new double[15];
	static int add=1;
	static double runtot=0;
	static double taxes;

	public static void main(String[]args) {
		
		String choice;
		String p = "publication";
		String f="food";
		String o = "other";
		String c="checkout";
		String con = "continue";
		String v="view";
		int er = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Store! \nWhat would you like to put in your Shopping Cart?");

		
		boolean qw = true;
		do {
			
			System.out.println("Please type PUBLICATION, FOOD, or OTHER: ");
			choice = keyboard.nextLine();
			
			if (choice.equalsIgnoreCase(p)) {
				pubs();
			} 
			if (choice.equalsIgnoreCase(f)) {
				foods();
			}
			if (choice.equalsIgnoreCase(o)) {
				other();
			}
			
			
			
			System.out.println("item added!\nType CHECKOUT to checkout or CONTINUE to keep shopping "
			+ "or VIEW to see how many items are in your cart!");
			
			choice = keyboard.nextLine();
			if (choice.equalsIgnoreCase(c)) {
				er =1;
			}else if (choice.equalsIgnoreCase(v)) {
				System.out.println("You have "+(add-1)+" item in your cart!");
			}
			
		} while (er == 0);
	
		finale();
	
	}
	
	private static void finale() {
		System.out.println("Checkout!");
		for (int i=1;i<add;i++) {
			if (book_name[i]== null) {
			}else {
				System.out.println(book_name[i]+"\t\t"+"$"+book_price[i]);
			}
			if (food_name[i]==null) {
				
			}else {
				System.out.println(food_name[i]+"\t\t"+"$"+food_price[i]);
			}
			if (other_name[i]==null) {
				
			}else {
				System.out.println(other_name[i]+"\t\t"+"$"+other_price[i]);
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Subtotal:\t$"+runtot);
		System.out.printf("Taxes:\t$%.2f",taxes);
		System.out.printf("\nTotal:\t$%.2f",(taxes+runtot));
	}

	public static void pubs() {

		
		for (int i=0;i<1;i++) {
			Scanner keyboard = new Scanner(System.in);
			

			System.out.println("Input the name of book: ");
			book_name[add] = keyboard.nextLine();
			System.out.println("Input the price: ");
			book_price[add] = keyboard.nextDouble();
			taxes += book_price[add]*.08;
			runtot += book_price[add];
			Publication publication = new Publication(book_name[add],book_price[add]);
		}
		add++;
		
	}
	
	public static void foods() {
		for (int i=0;i<1;i++) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Input the name of the food item: ");
			food_name[add] = keyboard.nextLine();
			System.out.println("Input the price: ");
			food_price[add] = keyboard.nextDouble();
			runtot += food_price[add];
			Foods food = new Foods(food_name[add],food_price[add]);
		}
		add++;
	}
	
	public static void other()
	{	
		for (int i=0;i<1;i++) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Input the name of the item: ");
			other_name[add] = keyboard.nextLine();
			System.out.println("Input the price: ");
			other_price[add] = keyboard.nextDouble();
			runtot += other_price[add];
			taxes += other_price[add]*.0725;
			General_Items other = new General_Items(other_name[add],other_price[add]);
		}
		add++;
	}
}

