# Count and say

public class Solution {
	public String countAndSay(int a) {
		
	// number is 0
	 	if(a<=0){
	        System.out.println("NULL");
	    }
	    String ans = "1";
		
	//Function call
	    ans = Code(a, "1");
	    return ans;
	}
	public static String Code(int a, String ans){
		
	//number is 1 i.e. the first number
	    if(a == 1){
	        return ans;
	    }
	    else if(a > 1)
	    {	
	//recursive call, decrement value of the given number
	        ans = Code(a-1, ans);
	       	StringBuilder sb = new StringBuilder();
	        int count = 1;
	        for(int i=1; i<ans.length(); i++){
				
		//increment the counter value if, previous and current value of the number is same
	            if(ans.charAt(i) == ans.charAt(i-1)){
	                count++;
	            }
				
		//append the counter and the number
	            else{
	                sb.append(count);
	                sb.append(ans.charAt(i-1));
	                count = 1;
	            }
	        }
	//append the counter value and the number and return the string
	        sb.append(count);
	        sb.append(ans.charAt(ans.length()-1));
	        return sb.toString();
	    }
	    else{
	    	return ans;
	    }
	}
}
