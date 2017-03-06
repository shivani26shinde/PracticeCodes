# Remove duplicate element from sorted array

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
		
		// Single element
	    if(a.size() == 1){
	        return 1;
	    }
		
		// 2 elements, check for duplicate value
	    if(a.size() == 2){
	        if(a.get(0) == a.get(1)){
	            a.remove(1);
	            return a.size();
	        }
	        else{
	            return a.size();
	        }
	    }
	    int index = 1;
	    int n = a.size();
		
		// Two pointers, one to iterate and second one to replace 
	    for (int i = 1; i < n; i++) {
	        if (a.get(i) != a.get(i - 1)) {
	            int temp = a.get(index);
	            a.set(index, a.get(i));
	            index++;
	        }
	    }
		
		// Return second pointer value
	    return index;
	}
}
