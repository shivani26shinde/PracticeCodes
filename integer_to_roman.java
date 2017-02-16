# Integer to Roman

public class Solution {
	public String intToRoman(int a) {
	
		# returns null if requirement fails
	    if(a <= 0 || a > 3999){
	        return null;
	    }
	    StringBuilder sb = new StringBuilder();
		
		# predefined array
	    int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    int len = 0;
		
		# iterate till the end of the array
	    while(len < values.length){
	        int val = a/values[len];
			
			# append same character till the condition fails
            while(val != 0){
                sb.append(strings(values[len]));
                a = a%values[len];
                val--;
	        }
	        len++;
	    }
	    return sb.toString();
	    
	}
	# Function that returns charaters for a number
	public String strings(int a){
	    if(a == 1){
	       return "I";
	    }
	    else if(a == 4){
	       return "IV";
	    }
	    else if(a == 5){
	       return "V";
	    }
	    else if(a == 9){
	       return "IX";
	    }
	    else if(a == 10){
	       return "X";
	    }
	    else if(a == 40){
	       return "XL";
	    }
	    else if(a == 50){
	       return "L";
	    }
	    else if(a == 90){
	       return "XC";
	    }
	    else if(a == 100){
	       return "C";
	    }
	    else if(a == 400){
	       return "CD";
	    }
	    else if(a == 500){
	       return "D";
	    }
	    else if(a == 900){
	       return "CM";
	    }
	    else if(a == 1000){
	       return "M";
	    }
	    else{
	        return null;
	    }
	}
}
