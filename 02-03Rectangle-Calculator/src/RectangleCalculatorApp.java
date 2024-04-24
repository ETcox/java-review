import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Rectangle Calculator App!");
		
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter length: ");
			double length = sc.nextDouble();
			System.out.println("Enter width: ");
			double width = sc.nextDouble();
			
			double area = width * length;
			double perimeter = 2 * width + 2 * length;
			
			System.out.println("Area: "+area);
			System.out.println("Perimeter: "+perimeter);
			
			System.out.println("Continue? (y/n): ");
			choice = sc.next();

		}
			
			
		System.out.println("Goodbye!");
	}
	
}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
