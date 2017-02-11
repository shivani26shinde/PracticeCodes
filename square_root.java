# Square root of an integer

public class Solution {
	public int sqrt(int a) {
	    int ans = 0;
		
		# number is 1
	    if(a == 1){
	        return 1;
	    }
		
		# number is 0
	    if(a == 0){
	        return 0;
	    }
		
	    int begin = 0;
	    int end = a;
		
		# Binary serach to check the square root
	    while(begin <= end){
	        int mid = (end+begin)/2;
			
			# shifting the begin pointer
	        if(mid*mid < a){
	            begin = mid+1;
	            ans = mid;
	        }
			
			# shifting the end pointer
	        else if(mid*mid > a){
	            end = mid-1;
	        }
			
			# square root found
	        else if(mid*mid == a){
	            return mid;
	        }
	    }
        return ans;	    
	}
}

