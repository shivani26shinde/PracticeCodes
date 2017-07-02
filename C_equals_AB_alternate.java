# C is a digit with alternating combination of digits in A and B

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A = 748;
		int B = 33456;
		String a = String.valueOf(A);
		String b = String.valueOf(B);
		StringBuilder sb = new StringBuilder();
		int n1 = 0;
		int n2 = 0;
		while(n1 != a.length() || n2 != b.length()){
			if(n1 != a.length()){
				sb.append(a.charAt(n1));
				n1++;
				if(Integer.parseInt(sb.toString()) > 100000000){
					break;
				}
			}
			if(n2 != b.length()){
				sb.append(b.charAt(n2));
				n2++;
				if(Integer.parseInt(sb.toString()) > 100000000){
					break;
				}
			}
		}
		if(Integer.parseInt(sb.toString()) > 100000000){
			System.out.println(-1);
		}
		else{
			System.out.println(Integer.parseInt(sb.toString()));
		}
	}
}