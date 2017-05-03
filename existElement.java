# Element exists in sorted rows or columns

import java.util.*;
import java.lang.*;
import java.io.*;

class ElementExists
{
	public static boolean Exists(int[][] array, int n, int x){
		int RowS = 0;
		int RowE = n-1;
		int ColS = 0;
		int ColE = n-1;
		while(RowS < n && ColE >= 0){
			int oneEnd = array[RowS][ColE];
			if(oneEnd == x){
				return true;
			}
			if(oneEnd < x){
				RowS++;
			
			}
			else{
				ColE--;
			}
		}
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int x = 13;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				array[i][j] = sc.nextInt();
			}
		}
		boolean ans = Exists(array, n, x);
		if(ans == true){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
}