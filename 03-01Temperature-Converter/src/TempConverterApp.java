import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Temp Converter App!");
		
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter degrees in Fahrenheit: ");
			double fahr = sc.nextDouble();
			double celsius = (fahr-32)*5/9;
			System.out.println("Degrees in Celsius: "+celsius);
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
		
		
		
		
		
		System.out.println("Goodbye!");

	}

}