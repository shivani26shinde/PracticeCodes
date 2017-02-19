# Atoi implementation

public class Solution {
	public int atoi(final String a) {
	
	// empty string
	    if(a.length() == 0){
	        return 0;
	    }
	    int ans = 0;
	    int i = 0;
	    double res = 0;
	    Character c = '0';
		
	// Avoid whitespaces
	    while(i < a.length() && a.charAt(i) == ' '){
	        i++;
	    }
		
	// Check (-)ve or (+)ve sign
	    if(i < a.length() && a.charAt(i) == '-' || i < a.length() && a.charAt(i) == '+'){
	        c = a.charAt(i);
	        i++;
	    }
		
	// Numeric digits
	    while (i < a.length() && Character.isDigit(a.charAt(i))) {
    		res = res * 10 + Character.getNumericValue(a.charAt(i));
    		i++;
    	}
		
	// Add sign
    	if(c.equals('-')){
    	   res = -res; 
    	}
    
	// Check for condition
	    if(res != 0){
	        if (res > Integer.MAX_VALUE){
	            return Integer.MAX_VALUE;
	        }
        	else if (res < Integer.MIN_VALUE){
        	    return Integer.MIN_VALUE;
        	}
        	else{
        	    return (int) res;
        	}
	    }
	    return 0 ;
	}
}
