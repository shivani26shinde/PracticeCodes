# Bubble Sort
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
		for(int i=0;i<=n/2;i++){
			for(int j=1;j<n;j++){
			
			// Compare every two elements
				if(arr[j-1] >= arr[j]){
					int var = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = var;
				}
			}
		}
		
		// Print sorted array
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}