
public class CC03MakeChocolate {

	public static void main(String[] args) {
		System.out.println("Welcome to Chocolate Making App");
	
	
		int small;
		int big;
		int goal;
		
		
		System.out.println(makeChocolate(4,1,9));
		System.out.println(makeChocolate(4,1,10));
		System.out.println(makeChocolate(4,1,7));
		
		System.out.println("Goodbye!");
	}
	
	public static int makeChocolate(int small, int big, int goal) {
		
		
		int stillNeeded = goal - (big*5);
		
		
		int smallBarsNeeded = stillNeeded-small;
		
		if(smallBarsNeeded == 0) {
			smallBarsNeeded = small;}
		else
		if(smallBarsNeeded <= -1) {
			smallBarsNeeded = smallBarsNeeded + small;
		}else
		if(smallBarsNeeded >= 1) {
			smallBarsNeeded = -1;}
			
		
		return smallBarsNeeded;
	}
	
	
	
	

}
