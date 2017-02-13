# Search for a range

public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> ans = new ArrayList<>();
		
		# list is empty
	    if(a.size() == 0){
	        ans.add(-1);
	        ans.add(-1);
	        return ans;
	    }
		
		# list has one element and it is the target element
	    if(a.size() == 1 && a.get(0) == b){
	        ans.add(0);
	        ans.add(0);
	        return ans;
	    }
		
	    int start = 0;
	    int end = a.size() - 1;
		
		# entire list has only the target element
	    if(a.get(start) == b && a.get(end) == b){
	        ans.add(start);
	        ans.add(end);
	        return ans;
	    }
		
		# Look for the range of the target element in the list
	    while(start<=end){
	        int mid = (end+start)/2;
			
			# target element found
	        if(a.get(mid) == b){
	            int first = mid;
	            int last = mid;
				
				# get starting point of the range
	            while(first > 0 && a.get(first-1) == b){
	                first--;
	            }
				
				# get end point of the range
	            while(last < a.size()-1 && a.get(last+1) == b){
	                last++;
	            }
	            ans.add(first);
	            ans.add(last);
	            return ans;
	        }
	        else if(a.get(mid) < b){
	            start = mid+1;
	        }
	        else if(a.get(mid) > b){
	            end = mid-1;
	        }
	    }
		# target element not found in the list
	    ans.add(-1);
	    ans.add(-1);
	    return ans;
	}
}
