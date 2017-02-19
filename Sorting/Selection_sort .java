# Selection Sort
# Worst-case complexity: O(n^2)

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// Input array
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		// Iterate over the array
		for(int i=0;i<n;i++){
			int temp = arr[i];
			int val = i;
			for(int j=i;j<n;j++){
				if(temp < arr[j]){
					j++;
				}
				else{
					temp = arr[j];
					val = j;
				}
			}
			// Swap min value with current pointer value
			int var = arr[i];
			arr[i] = arr[val];
			arr[val] = var;
		}
		
		// Print sorted array
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}