# Spiral Matrix

import java.util.*;
import java.lang.*;
import java.io.*;

class SpiralMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		// input array
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = 0;
		int b = n-1;
		int R = 0;
		int D = 0;
		int L = n-1;
		int U = n-1;
		
		// Loop until it reaches the centre
		while(R != n/2 && D != n/2){
		
			// Increment the right pointer
			while(R != L){
				list.add(arr[D][R]);
				R++;
			}
			
			// Increment the down pointer
			while(D != U){
				list.add(arr[D][R]);
				D++;
			}
			
			// Decrement the left pointer
			while(L != a){
				list.add(arr[U][L]);
				L--;
			}
			
			// Decrement the up pointer
			while(U != a){
				list.add(arr[U][L]);
				U--;
			}
			
			// Move inwards
			a = a+1;
			b = b-1;
			R = a; L = b; D = a; U = b;
			
			// Add centre element
			if(a == b){
				list.add(arr[a][b]);
			}
		}
		
		// Print the list
		System.out.println(list);
	}
}