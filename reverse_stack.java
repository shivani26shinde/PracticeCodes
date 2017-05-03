# Reverse a stack

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStack
{
	// Gets reversed stack
	public static Stack<Integer> Reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return stack;
		}
		int temp = stack.pop();
		Reverse(stack);
		// After popping, calls "addBottom" to push the top element at bottom
		addBottom(stack, temp);
		return stack;
	}
	
	// Adds element to the bottom
	public static void addBottom(Stack<Integer> stack, int x){
		//Adds element at the bottom
		if(stack.isEmpty()){
			stack.push(x);
			return;
		}
		// Keeps popping to reach bottom
		int temp = stack.pop();
		addBottom(stack, x);
		stack.push(temp);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<5;i++){
			stack.push(i);
		}
		System.out.println(stack);
		Stack<Integer> stackans = Reverse(stack);
		System.out.println(stackans);
	}
}