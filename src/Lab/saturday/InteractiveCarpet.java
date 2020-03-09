package Lab.saturday;
import java.util.Scanner;
/**
Calculate the cost of carpeting a room taking the values from the user
SaturdayLab1: Data types. Variables. Constants.
Problem 6
Follow the Carpet class to create an interactive application. Instead of assigning
values to the length, width and price variables accept them from the user as
input. Save the revised class as InteractiveCarpet.java.
*/
public class InteractiveCarpet {

	public static void main(String[] args) {
		
		double length, width, price, cost;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght");
		length = sc.nextDouble();
		System.out.println("Please enter the width");
		width = sc.nextDouble();
		System.out.println("Please enter the price");
		price = sc.nextDouble();
		
		cost = length * width * price;
		
		String resultText = "The total cost of our carpet ";
		String costText = " will cost you around ";
		System.out.println(resultText + "width: " + width + " and with lenght " + length + costText + cost + " EUR");
		
		//

	}

}
