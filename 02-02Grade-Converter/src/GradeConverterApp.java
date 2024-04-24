import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Grade Converter App");
		
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(choice.equalsIgnoreCase("y")) {
			
			String letterGrade = "F";
			
			System.out.println("Enter numerical grade");
			int numberGrade = sc.nextInt();
			
			if(numberGrade >= 88) {
				letterGrade = "A";
			}else
			if(numberGrade >= 80) {
				letterGrade = "B";
			}else
			if(numberGrade >=67) {
				letterGrade = "C";
			}else
			if(numberGrade >= 60) {
				letterGrade = "D";
			}
			
			System.out.println("Letter Grade: "+ letterGrade);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Goodbye!");

	}

}
