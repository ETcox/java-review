
public class LeetCode {

	public static void main(String[] args) {
	 

	   
	
	    
	}	  
	public int findNumbers(int[] nums) {
        
        int count = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
	
	 // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
