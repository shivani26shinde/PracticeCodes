# Minimum number with average of two

# Ex: 7 6 3 5
# Ans: 635 ---- (average of 7 and 6 then 3, 5)

import java.util.*;
import java.lang.*;
import java.io.*;

class MinAvg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		// Input array
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		
		// Iterate over the array till second last position
		for(int i=0;i<n-1;i++){
			int val = (array[i]+array[i+1])/2;
			
			// Average is smaller, so add average and remaining numbers to the final string
			if(array[i] > val){
				sb.append(val);
				i = i+2;
				while(i<=n-1){
					sb.append(array[i]);
					i++;
				}
				break;
			}
			
			// Add the number to the final string and calulate next average, until the second last value
			else{
				if(i == n-2){
					sb.append(val);
					break;
				}
				else{
					sb.append(array[i]);
				}
			}
		}
		
		// Print the final answer
		System.out.println("Minimum value: " +sb.toString());
	}
}