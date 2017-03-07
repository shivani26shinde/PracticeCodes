# Remove duplicate, allowing 2 occurances

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    if(a.size() <= 2){
	        return a.size();
	    }
	    int ind = 0;
	    int i = 0;
	    while(i<a.size()-2){
	        if(a.get(i).intValue() != a.get(i+1).intValue() || a.get(i).intValue() != a.get(i+2).intValue()){
	            int temp = a.get(ind);
	            a.set(ind, a.get(i));
	            ind++;
	        }
	        i++;
	    }
	    a.set(ind++, a.get(i++));
	    a.set(ind++, a.get(i++));
	    return ind;
	}
}
