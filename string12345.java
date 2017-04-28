# Given a string "12345"....

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "666";
		int i=1;
		StringBuilder sb = new StringBuilder();
		while(i<s.length()){
			int a = Character.getNumericValue(s.charAt(i));
			int b = Character.getNumericValue(s.charAt(i-1));
			int val = (a+b)/2;
			if(val > b){
				sb.append(val);
				i++;
				break;
			}
			else{
				sb.append(b);
				i++;
			}
		}
		while(i != s.length()){
			sb.append(Character.getNumericValue(s.charAt(i)));
			i++;
		}
		System.out.println(sb.toString());
	}
}