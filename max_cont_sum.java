#Max sum contiguous subarray

public class Solution {
	// DO NOT MODFIY THE LIST. 
    public int maxSubArray(final List<Integer> A) {
	    
		# set sum to default min value and last to 0
	    int sum = Integer.MIN_VALUE;
	    int last = 0;
		
	    # selecting numbers from array
	    for (int num : A) {
	        
	        last = last + num;
			
	        sum = Math.max(sum, last);
			
			# updating last if less than 0
            if (last < 0)
	            last = 0;
	    }
	    
	    return sum;
	    
	}
}