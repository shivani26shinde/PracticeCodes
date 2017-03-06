# Sort by color

public class Solution {
	public void sortColors(ArrayList<Integer> a) {
	
		// Single element
	    if(a.size() == 1){
	        return;
	    }
		
		// Two elements, compare the two and sort
	    if(a.size() == 2){
	        if(a.get(0) > a.get(1)){
	            int temp = a.get(0);
	            a.set(0, a.get(1));
	            a.set(1, temp);
	        }
	        else{
	            return;
	        }
	    }
		
		// Three variables to store occurance count
	    int red = 0;
	    int white = 0;
	    int blue = 0;
	    for(int i = 0; i < a.size(); i++){
	        if(a.get(i) == 0){
	            red++;
	        }
	        else if(a.get(i) == 1){
	            white++;
	        }
	        else if(a.get(i) == 2){
	            blue++;
	        }
	    }
		
		// Using those three variables, sort the elements
	    for(int i = 0; i < a.size(); i++){
	        while(red != 0){
	            a.set(i, 0);
	            red--;
	            i++;
	        }
	        while(white != 0){
	            a.set(i, 1);
	            white--;
	            i++;
	        }
	        while(blue != 0){
	            a.set(i, 2);
	            blue--;
	            i++;
	        }
	    }
	    return;
	}
}
