# Length of the last word

public class Solution {
	public int lengthOfLastWord(final String a) {
	    int len = a.length();	    
	    int count = 0;
	    int max = 0;
	
	//Empty string
	    if(len == 0){
	        return 0;
	    }
	//Iterate over the string
	    for(int i=0;i<len;i++){
	        while(i<len && (a.charAt(i) != ' ')){
	            max++;
	            i++;
	        }
		//Update length of every word
	        if( max != 0){
	            count  = max;
	        }
		//Only spaces encountered
	        max = 0;
	    }
	//Return length of last word
	    return count;
}
}
