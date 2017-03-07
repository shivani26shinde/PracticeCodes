# Remove an element from array

public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
	    if(a.size() == 0){
	        return  0;
	    }
	    if(a.size() == 1){
	        if(a.get(0) == b){
	            a.remove(0);
	            return 0;
	        }
	        else{
	            return 1;
	        }
	    }
	    int ind = 0;
	    int i = 0;
	    while(i<a.size()){
	        if(a.get(i) != b){
	            int temp = a.get(ind);
	            a.set(ind, a.get(i));
	            a.set(i, temp);
	            ind++;
	        }
	        i++;
	    }
	    return ind;
	}
}
