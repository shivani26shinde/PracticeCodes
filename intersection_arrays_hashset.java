# Intersection of sorted arrays (Ignoring duplicate elements)

public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	    ArrayList<Integer> list = new  ArrayList<Integer>();
	    
		// Store list 1 in hashset
	    HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i: a){
            set1.add(i);
        }
 
		// Store list 2 in hashset
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: b){
            set2.add(i);
        }
		
		// Check if element exists in both the lists, add it to final list and delete all its occurances from set 1 and set 2.
        for(int i: b){
            if(set1.contains(i)){
                list.add(i);
                set1.remove(i);
                set2.remove(i);
            }
        }
		
		// Return final list
	    return list;
	}
}
