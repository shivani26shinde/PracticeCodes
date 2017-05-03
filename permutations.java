# Permutations

import java.util.*;
import java.lang.*;
import java.io.*;

class Permutations
{
	static ArrayList<String> list = new ArrayList<String>();
	public static void permutations(String prefix, String suffix){
		if(suffix.length() == 0){
			list.add(prefix);
		}
		for(int i=0;i<suffix.length();i++){
			permutations(prefix + suffix.charAt(i), 
							suffix.substring(0,i) + suffix.substring(i+1,suffix.length()));
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "abcd";
		String a = "";
		permutations(a,s);
		System.out.println(Arrays.toString(list.toArray()));
	}
}