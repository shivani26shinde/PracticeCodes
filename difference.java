# Difference (Using 2 pointers)

public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
	
		// Single element
	    if(a.size() == 1){
	        return 0;
	    }
		
		// Two elements, check the difference
	    if(a.size() == 2){
	        if(a.get(1) - a.get(0) == b){
	            return 1;
	        }
	        else{
	            return 0;
	        }
	    }
		
		// Check difference between all the elements
	    for(int i = 0; i < a.size()-1; i++){
	        for(int j = i+1; j <a.size(); j++){
	            if(a.get(j) - a.get(i) == b){
	                return 1;
	            }
	        }
	    }
	    return 0;
	}
}