# Insertion Sort

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
		for(int i=1;i<n;i++){
			int j = i-1;
			int val = i;
			// Compare with previous elements and insert element at its correct position
			while(j>=0 && arr[j] > arr[val]){
				int temp = arr[j];
				arr[j] = arr[val];
				arr[val] = temp;
				if(j>0){
					j--;
					val--;
				}
			}
		}
		// Print sorted array
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}