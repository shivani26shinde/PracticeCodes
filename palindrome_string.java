# Palindrome String

public class Solution {

	public int isPalindrome(String a) {
	
	// replacing the string to lowercase
	    String s = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
	    int n = s.length();    
	    int start =0;
	    int end = n - 1;
		
	// run the loop till it reaches half the length of the string
	    while(start < end)
	    {	
			# two characters don't match, its not a palindrome string
	        if(s.charAt(start) != s.charAt(end))
	        {
	            return 0;
	        }
			
			# increment start pointer and decrement end pointer
	        else
	        {
	            start++;
	            end--;
	        }
	    }
		
	// string is a palindrome
	    return 1;
	}
}
