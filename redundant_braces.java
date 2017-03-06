# Redundant Braces

// Returns 1, if redundant braces are present
// Returns 0, if redundant braces are not present
public class Solution {
	public int braces(String a) {
	    Stack<Character> st = new Stack<Character>();
      
      // Iterate over the string
	    for(int i=0;i<a.length();i++){
      
        // Check for closed braces
	        if(a.charAt(i) == ')'){
	            int count = 0;
              
              // Check for open braces
	            while(st.peek() != '('){
	                count++;
	                st.pop();
	            }
	            st.pop();
              
              // Less than two elements between the closed and open braces
	            if(count < 2){
	                return 1;
	            }
	        }
          
          // Push other elements
	        else{
	            st.push(a.charAt(i));
	        }
	    }
      
      // After popping, check for extra brace in stack
	    while(st.empty() == false){
	        if(st.peek() == '(' || st.peek() == ')'){
	            return 1;
	        }
	        st.pop();
	    }
	    return 0;
	}
}
