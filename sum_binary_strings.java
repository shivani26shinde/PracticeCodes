# Add two binary strings

public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
	  
		# Empty strings
	    if(a.length() == 0 || b.length() == 0){
	        return null;
	    }
		
		# Add 0's to make the two strings of equal length
	    if(a.length() > b.length()){
	    	while(a.length() - b.length() != 0){
	    		b = '0' + b;
	    	}
	    }
		
		# Add 0's to make the two strings of equal length
	    else if(b.length() > a.length()){
	 		while(b.length() - a.length() != 0){
	 			a = '0' + a;
	 		}
	    }
	    int one = a.length()-1;
	    int two = b.length()-1;
	    Character temp = '0';
		
		# Iterate till the start of the strings
	    while(one>=0 || two>=0){
			
			# Function call, perform addition on carry and string 1 value
	    	int ans = Value(temp, a.charAt(one));
			
			# Returned value either 0 or 1
	    	if(ans == 0 || ans == 1){
	    		Character t = Character.forDigit(ans%10,2);
				
				# Function call, perform addition on previous ans and string 2 value
	    		int fans = Value(t, b.charAt(two));
				
				# Returned value either 0 or 1 (second function call)
	    		if(fans == 0 || fans == 1){
	    			sb.append(fans);
	    			temp = '0';
	    		}
				
				#Returned value 10 (second function call)
	    		else{
	    			sb.append(fans%10);
	    			temp = '1';
	    		}
	    	}
			
			# Returned value 10
	    	else{
	    		temp = '1';
	    		Character t = Character.forDigit(ans%10,2);
				
				# Function call, perform addition on previous ans and string 2 value
	    		int fans = Value(t, b.charAt(two));
	    		sb.append(fans%10);
	    	}
	    	one--;
	    	two--;
	    }
		
		# Last carry on
	    if(temp != '0'){
	    	sb.append(temp);
	    }
		
		# Reverse string and return
	    return sb.reverse().toString();
	}
	# Perform the sum operation
	public static int Value(Character a, Character b){
	    if(a == '0' && b == '0'){
	        return 0;
	    }
	    else if(a == '1' && b == '0'){
	        return 1;
	    }
	    else if(a == '0' && b == '1'){
	        return 1;
	    }
	    else if(a == '1' && b == '1'){
	        return 10;
	    }
	    else{
	        return 0;
	    }
	}
	}
