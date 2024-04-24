import java.util.Scanner;

public class TravelTimeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Travel Time App!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("y")) {
			
			
			System.out.println("Enter miles: ");
			double totalMiles = sc.nextDouble();
			
			System.out.println("Enter miles per hour: ");
			double mph = sc.nextDouble();
			
			System.out.println("Estimated travel time");
			System.out.println("-------------------------");
			
			double totalTime = (totalMiles/mph) ;
			int hours = (int)totalTime;
			double mins = (totalTime-(int)totalTime)*60;
			int minutes = (int)mins;
			
			System.out.println("Hours: "+hours);
			System.out.println("Minutes: "+minutes);
			
			
			
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		
		
		
		
		
		System.out.println("Goodbye!");

	}

}