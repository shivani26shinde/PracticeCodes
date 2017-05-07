# Count total number of unique binary trees

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Count(int n, int[] sol){
		if(n==0||n==1){
			return 1;
		}
		if(n<0){
			return 0;
		}
		int pos = 0;
		for(int i=0;i<n;i++){
			if(sol[i] == -1){
				sol[i] = Count(i, sol);
			}
			if(sol[n-1-i] == -1){
				sol[n-i-1] = Count(n-i-1, sol);
			}
			pos = pos+(sol[i]*sol[n-i-1]);
		}
		return pos;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=2;
		int[] sol = new int[]{-1,-1,-1,-1,-1,-1};
		System.out.println(Count(n,sol));
	}
}