import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.HashSet;

public class CC01 {

	
	    

	    public static void main(String[] args) {
	        int[] nums = {10, 15, 3, 7};
	        int k = 17;
	        System.out.println("Does the list contain two numbers that add up to " + k + "? " + hasTwoSum(nums, k));
	    }
	    
	    public static boolean hasTwoSum(int[] nums, int k) {
	        HashSet<Integer> complementSet = new HashSet<>();
	        for (int num : nums) {
	            int complement = k - num;
	            if (complementSet.contains(complement)) {
	                return true;
	            }
	            complementSet.add(num);
	            
	        }
	        return false;
	    }
	

}
