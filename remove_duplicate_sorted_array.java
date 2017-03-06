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
	    for(int i = 0; i < a.size()-1; i++){
	        int j = i+1;
	        while(i < j && j < a.size() && a.get(i) != a.get(j)){
	            i++;
	            j++;
	        }
	        while(i < j && j < a.size() && a.get(i) == a.get(j)){
	            a.remove(j);
	        }
	    }
	    return a.size();
	}
}
