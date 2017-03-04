# Rain water trapped

public class Solution{
	// DO NOT MODIFY THE LIST
	public int trap(final List<Integer> a){
	
		// Only two buildings
	    if(a.size() <= 2){
	        return 0;
	    }
		
	    int temp = 0;  
		
		// Ignore 0's present at the start
        while (temp < a.size() && a.get(temp) == 0){
            temp++;
        }              
        int value = 0;  
        Stack<Integer> stack = new Stack<Integer>(); 

		// Iterate over the list
        while (temp < a.size()){  
			
			// Next building height is greater than current
            while (!stack.isEmpty() && a.get(temp) >= a.get(stack.peek())){
				
				// pop current value
                int b = stack.pop();

				// Check the accumulation between maximum height building and previous building
                if (!stack.isEmpty()){
                   value = value + (temp - stack.peek() - 1) * (Math.min(a.get(temp), a.get(stack.peek())) - a.get(b));  
                }
            }  
			
			// Next building height is smaller than current
            stack.push(temp);  
            temp++;  
        }  
		// Final accumulation
        return value;  
	}
}
