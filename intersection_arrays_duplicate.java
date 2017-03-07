# Intersection of sorted arrays (Considering duplicate elements)

public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {

	    ArrayList<Integer> list = new  ArrayList<Integer>();
	    int i = 0;
	    int j = 0;
	    
		// Keep iterating till the end of the lists
	    while(i <= a.size()-1 && j <= b.size()-1){
		
			// List 1 has smaller element so, increment its pointer
            if(a.get(i) < b.get(j)){
                i++;
            }
			
			// List 2 has smaller element so, increment its pointer
            else if(a.get(i) > b.get(j)){
                j++;
            }
			
			// Elements match, add to the list
            else{
                list.add(b.get(j));
                j++;
                i++;
            }
	    }
		
		// Return list
	    return list;
	}
}
