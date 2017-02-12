# Sorted Insert Position

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	
		# list has one element, either add before or after
	    if(a.size() == 1){
	        if(b<a.get(0)){
	            return 0;
	        }
	        else if(b>a.get(0)){
	            return 1;
	        }
	    }
		
		# list is empty
	    if(a.size() == 0){
	        return 0;
	    }
		
	    int start = 0;
		int end = a.size()-1;
		int ans = 0;
		
		# get the position of the element 
		while(start <= end){
			int mid = (end+start)/2;
			
			# element found in the list
			if(a.get(mid) == b){
				return mid;
			}
			else if(a.get(mid) < b){
				start = mid+1;
				ans = start;
			}
			else if(a.get(mid) > b){
				end = mid-1;
			}
		}
		
		# position for the element found
		return ans;
	}
}
