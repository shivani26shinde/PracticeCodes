# Implement stack in O(1)

class Solution {
    Stack<Integer> st;
    int min;
    Solution(){
        st = new Stack<Integer>();
    }
	
	// push element in the stack
    public void push(int x){
       if(st.isEmpty()){
           min = x;
           st.push(x);
       }
       else if(x < min){
           st.push(x - min);
           min = x;
       }
       else{
           st.push(x);
       }
    }
	
	// pop element from the stack
    public void pop(){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        if(temp < min){
            min = min - temp;
        }
        return;
    }
	
	// return top element from the stack
    public int top(){
       if(st.isEmpty()){
            return -1;
        } 
        int temp = st.peek();
        if(temp < min){
            return min;
        }
        else{
            return temp;
        }
    }
	
	// return minimum element from the stack
    public int getMin(){
        if(st.isEmpty()){
            return -1;
        }
        else{
            return min;
        }
    }
}
