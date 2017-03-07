# Merge two lists

public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    if(a.size() == 0 && b.size() == 0){
	        return;
	    }
	    if(a.size() == 0){
	        for(int i=0; i<b.size(); i++){
	            a.set(i, b.get(i));
	        }
	        return;
	    }
	    if(b.size() == 0){
	        return;
	    }
	    int i = 0;
	    int j = 0;
	    while(i<a.size()){
            if(j<b.size() && a.get(i) >= b.get(j)){
                a.add(i, b.get(j));
                j++;
	        }
	        i++;
	    }
	    if(j<b.size()){
	        while(j<b.size()){
	            a.add(b.get(j));
	            j++;
	        }
	    }
	    return;
	}
}
