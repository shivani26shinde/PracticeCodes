# Matrix Search

public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	
	# Size of the matrix
	    int m = a.size();
	    int n = a.get(0).size();
		
	# Single element in the matrix
	    if(m==1 & n==1){
	        if(a.get(0).get(0) == b){
	            return 1;
	        }
	        else{
	            return 0;
	        }
	    }
		
	# Iterate over the matrix
	    for(int i = 0; i < m; i++){
	    	for(int j = 0; j < n; j++){
			
			# Element not present in the current row
	    		if(a.get(i).get(n-1) < b){
	    			break;
	    		}
			# Binary search, 1 row
	    		else{
	    			int ans = 0;
	    			while(j<=(n-1)){
	    				int mid = (j+(n-1))/2;
	    					if(a.get(i).get(mid) == b){
	    						return 1;
	    					}
	    					else if(a.get(i).get(mid) < b){
	    						j = mid+1;
	    						ans = j;
	    					}
	    					else{
	    						n = mid-1;
	    					}
	    				}
	    				if(a.get(i).get(ans) == b){
	    					return 1;
	    				}
	    				else{
	    					return 0;
	    				}
	    			}
	    		}
	    	}
		# Element not present in the matrix
	    return 0;
	}
}
