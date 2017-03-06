# Palindrome Integer

public class Solution {
	public boolean isPalindrome(int a) {
	// Less than 0 
	    if(a < 0){
	        return false;
	    }
	// Single digit number
	    if(a >=0 && a <= 9){
	        return true;
	    }
	    int val = a;
	    int ans = 0;
		
	// Reverse the integer
	    while(a != 0){
	        ans = ans*10 + a%10;
	        a = a/10;
	    }
	    if(val==ans){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
