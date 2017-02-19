# Multiply two strings

public class Solution {
	public String multiply(String a, String b) {
	    int len1 = a.length();
	    int len2 = b.length();
	    StringBuilder sb = new StringBuilder();
		
		// empty string
	    if(len1 == 0 || len2 == 0){
	        return "0";
	    }
		
		// multiply by 1
	    if(len1 == 1){
	        if(a.charAt(0) == 1){
	            return b;
	        }
	    }
		
		// multiply by 1
	    if(len2 == 1){
	        if(b.charAt(0) == 1){
	            return a;
	        }
	    }
		
		// place values at their positions, after multiplication 
	    int arr[] = new int[len1+len2-1];
	    for(int i=0;i<len1;i++){
	        for(int j=0;j<len2;j++){
	            arr[i+j] += Character.getNumericValue(a.charAt(i)) * Character.getNumericValue(b.charAt(j));
	        }
	    }
		
		// adjust the carry
	    int carry = 0;
	    for(int i=arr.length-1;i>=0;i--){
	        int temp = arr[i]%10;
	        carry = arr[i]/10;
	        if(carry > 0){
	            if(i > 0){
	                arr[i-1] = arr[i-1] + carry;
	                sb.append(temp);
	            }
	            else if(i==0){
	                sb.append(temp);
	                sb.append(carry);
	            }
	        }
	        else{
	            sb.append(temp);
	        }
	    }
	    sb = sb.reverse();
		
		// remove all trailing 0's (start of the string)
	    while(sb.length()> 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
	}
}
