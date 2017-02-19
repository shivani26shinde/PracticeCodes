# Power of 2

public class Solution {
	public int power(String a) {
	
	//Empty string
	    if(a.length() == 0){
	        return 0;
	    }
	//length of string is 1
	    if(a.length() == 1){
		//number is 0
	        if(a.charAt(0) == 0){
	            return 0;
	        }
		//number is 1 
	        if(a.charAt(0) == 1){
	            return 0;
	        }
		//number is 2
	        if(a.charAt(0) == 2){
	            return 1;
	        }
	    }
	    int carry = 0;
	    StringBuilder sb = new StringBuilder();
		
		//Iterate over the string
	    while(a.length() > 0 && !a.matches("2")){
	        int n = a.length();
			
			//odd number
	        if(a.charAt(n-1)%2 == 1){
	            return 0;
	        }
	        carry = 0;
	        sb = new StringBuilder();
			//division by 2
	        for(int  i = 0; i < n; i++){
	            Character c = a.charAt(i);
	            int val = Character.getNumericValue(c) + carry*10;
	            int temp = val/2;
	            carry = val%2;
	            sb.append(temp);
	        }
	        a = sb.toString();
			//for first digit < 2, '0' will be appended
	        if(a.charAt(0) == '0'){
	            a = a.substring(1,a.length());
	        }
	    }
	    return 1;
    }
}
