# Roman to Integer

public class Solution {
	public int romanToInt(String a) {
		
		# string is empty
		if(a.length() == 0){
			return 0;
		} 

		# set two pointers
		int present = 0;
		int previous = 0;
		int val = a.length()-1;
		
		# Loop till the start of the string
		while(val>=0){
			
			# get the character value
			int num = value(a.charAt(val));
			
			# Add the value of the last character
			if(val == a.length()-1){
				present = present+num; 
			}
			
			# Check the character value with the rightmost character value
			else{
				
				# if less then subtract
				if(num < previous){
					 present = present-num; 
				}
				# if more than add
				else{
					  present = present+num; 
					}
				}
				
				# update the pointer for later comparison
				previous = num;
				val--;
			}
		return present;
	}
	
	# Set values to every character
	public int value(Character c){
	    if(c == 'I'){
	       return 1; 
	    }
	    else if(c == 'X'){
	        return 10; 
	    }
	    else if(c == 'V'){
	        return 5;
	    }
	    else if(c == 'C'){
	        return 100;
	    }
	    else if(c == 'D'){
	        return 500;
	    }
	    else if(c == 'L'){
	        return 50;
	    }
	    else if(c == 'M'){
	        return 1000;
	    }
	    else{
	        return 0;
	    }
	}
}
