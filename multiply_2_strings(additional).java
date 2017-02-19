# Multiply two strings (return type double)

public class Solution {
	public String multiply(String a, String b) {
	    int len1 = a.length();
	    int len2 = b.length();
		
		// empty strings
	    if(len1 == 0 || len2 == 0){
	        return "0";
	    }
		
		// muliply by 1
	    if(len1 == 1){
	        if(a.charAt(0) == 1){
	            return b;
	        }
	    }
		
		// muliply by 1
	    if(len2 == 1){
	        if(b.charAt(0) == 1){
	            return a;
	        }
	    }
	    double sum = 0;
		
		// Multiply every digit and find the final sum
	    for(int i = len1-1; i >= 0; i--){
	    	int carry = 0;
	    	int num = 0;
	    	StringBuilder sb = new StringBuilder();
	    	for(int j = len2-1; j >= 0; j--){
			
			// carry is stored for next step
	    		int val = carry + 
	    				Character.getNumericValue(b.charAt(j))*
	    				Character.getNumericValue(a.charAt(i));
	    		if(val > 9){
	    			sb.append(val%10);
	    			carry = val/10;
	    		}
	    		else{
	    			sb.append(val);
	    		}
	    	}
	    	if(carry != 0){
	    		sb.append(carry);
	    	}
	    	String s = sb.reverse().toString();
			
			// calculating sum, appending 0's
	    	sum = sum + (Math.pow(10, len1-i-1))*Integer.parseInt(s);
	    }
	    return sum;
	}
}
