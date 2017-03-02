# Nearest smallest element

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        Stack<Integer> st = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Single element
		if(arr.size() == 1){
		    list.add(-1);
		    return list;
		}
		
		// Iterate over the list from last to first element
		for(int i=arr.size()-1; i>=0;i--){
		
			// Push last element in the stack
			if(i == arr.size()-1){
				st.push(arr.get(i));
				i--;
			}
			
			// Check for smaller value and if found, place that value in the respective position and pop the stack element
			while(i >= 0 && st.empty() != true && arr.get(i) < st.peek()){
				list.add(arr.indexOf(st.peek()), arr.get(i));
				st.pop();
			}
			
			// Push the list value in the stack
			st.push(arr.get(i));
		}
		
		// List values for which smaller value not found
		while(st.empty() != true){
			list.add(arr.indexOf(st.peek()), -1);
			st.pop();
		}
		
		// Return the list
		return list;
    }
}
