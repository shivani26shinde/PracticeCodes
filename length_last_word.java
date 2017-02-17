# Length of the last word

public class Solution {
	public int lengthOfLastWord(final String a) {
	    int len = a.length();
	    
	    int count = 0;
	    int max = 0;
	    if(len == 0){
	        return 0;
	    }
	    for(int i=0;i<len;i++){
	        while(i<len && (a.charAt(i) != ' ')){
	            max++;
	            i++;
	        }
	        if( max != 0){
	            count  = max;
	        }
	        max = 0;
	    }
	    return count;
}
}
