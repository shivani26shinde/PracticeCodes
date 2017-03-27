# All the permutations of a string in another string

import java.util.*;
import java.lang.*;
import java.io.*;

class StringPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String A = "BACDGABCDA";
		String B = "ABCD";
		int st1 = A.length();
		int st2 = B.length();
		ArrayList<Integer> list = new ArrayList<>();
		int ans = 0;
		int j = 0;
		
		// String 1 is shorter than string 2
		if(st1 < st2){
			System.out.println("Smaller string");
		}
		else{
			for(int i=0;i<=(st1-st2);i++){
				j = i+st2-1;
				String new_st1 = A.substring(i,j+1);
				// Function call
				boolean val = isSame(new_st1, B);
				if(val == true){
					list.add(i);
					ans += 1;
				}
			}
			System.out.println("Number of times: "+ans);
			System.out.println("At indexes: "+Arrays.toString(list.toArray()));
		}
	}
	
	// Part of string 1 is a permutation of string 2
	public static boolean isSame(String st1, String st2){
	
		// Sort the two strings and compare
		char[] array1 = st1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = st2.toCharArray();
		Arrays.sort(array2);
		if(String.valueOf(array1).equals(String.valueOf(array2))){
			return true;
		}
		return false;
	}
}