# Evaluate Expression

public class Solution {
	public int evalRPN(ArrayList<String> a) {
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i=0;i<a.size();i++){
	        while(a.get(i) != "+" && a.get(i) != "-"  && a.get(i) != "*" && a.get(i) != "/"){
	            st.push(a.get(i));
	        }
	        if(a.get(i) == "+"){
	            int val = Integer.parseInt(st.pop()) + Integer.parseInt(st.pop());
	            st.push(val);
	        }
	        else if(a.get(i) == "-"){
	            int val =Integer.parseInt(st.pop()) - Integer.parseInt(st.pop());
	            st.push(val);
	        }
	        else if(a.get(i) == "*"){
	            int val = Integer.parseInt(st.pop()) * Integer.parseInt(st.pop());
	            st.push(val);
	        }
	        else if(a.get(i) == "/"){
	            int val = Integer.parseInt(st.pop()) / Integer.parseInt(st.pop());
	            st.push(val);
	        }
	    }
	    return st.pop();
	}
}
