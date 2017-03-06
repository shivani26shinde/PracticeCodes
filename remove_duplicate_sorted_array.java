# Remove duplicate element from sorted array

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    if(a.size() == 1){
	        return 1;
	    }
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
	    for (int i = 1; i < n; i++) {
	        if (a.get(i).intValue() != a.get(i - 1).intValue()) {
	            int temp = a.get(index);
	            a.set(index, a.get(i));
	            index++;
	        }
	    }
	    return index;
	}
}
