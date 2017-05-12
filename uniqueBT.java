# Unique number of binary trees

import java.util.*;
import java.lang.*;
import java.io.*;

class UniqueBT
{
	public static int Count(int n, int[] array){
		if(n<0){
			return 0;
		}
		if(n==0 || n==1){
			return 1;
		}
		int count = 0;
		for(int i=0;i<n;i++){
			if(array[i] == -1){
				array[i] = Count(i, array);
			}
			if(array[n-i-1] == -1){
				array[n-i-1] = Count(n-i-1, array);
			}
			count += array[i]*array[n-i-1];
		}
		return count;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 6;
		int[] array = new int[]{-1,-1,-1,-1,-1,-1};
		System.out.println(Count(n,array));
	}
}