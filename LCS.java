# Longest Common substring

import java.util.*;
import java.lang.*;
import java.io.*;

class LCS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1 = "AbaB";
		String s2 = "BABa";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int l1 = s1.length()+1;
		int l2 = s2.length()+1;
		int[][] array= new int[l1][l2];
		for(int i=0;i<l1;i++){
			array[i][0] = 0;
		}
		for(int i=0;i<l2;i++){
			array[0][i] = 0;
		}
		for(int i=1;i<l1;i++){
			for(int j=1;j<l2;j++){;
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					array[i][j] = array[i-1][j-1] + 1;
				}
				else{
					array[i][j] = Math.max(array[i-1][j], array[i][j-1]);
				}
			}
		}
		System.out.println(array[l1-1][l2-1]);
	}
}