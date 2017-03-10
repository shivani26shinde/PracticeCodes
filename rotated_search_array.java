# Rotated sorted array search

public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
		
	// empty list
	    if(a.size() == 0){
	        return -1;
	    }
		
	// size of the list is 1
	    if(a.size() == 1){
	        if(a.get(0) == b){
	            return 0;
	        }
	        else{
	            return -1;
	        }
	    }
		
	    int start = 0;
	    int end = a.size() - 1;
	    int ans = -1;
		
	// binary search of the element
	    while(start <= end){
	        int mid = (end+start)/2;
			
	// element found
            if(a.get(mid) == b){
                 return mid;
            }
			
	// check if the element in the 1st half
            else if(a.get(start) <= a.get(mid)){
            	if(a.get(start) <= b && b < a.get(mid)){
            		end = mid - 1;
            	}
            	else{
            		start = mid + 1;
            	}
            }
			
	// check if the element in the second half
            else{
            	if(a.get(mid) < b && b <= a.get(end)){
            		start = mid + 1;
            	}
            	else{
            		end = mid - 1;
            	}
            }
        }
	    return ans;
    }
}
