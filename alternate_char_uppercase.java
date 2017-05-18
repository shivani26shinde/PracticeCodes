# Alternate characters to uppercase

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "geeksForgEeks";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length();i=i+2){
			if(s.charAt(i) >= 97){
				sb.append((char) (s.charAt(i)-32));
			}
			else{
				sb.append(s.charAt(i));
			}
			if(i+1 < s.length()){
				if(s.charAt(i+1) <= 90){
				sb.append((char) (s.charAt(i+1)+32));
				}
				else{
					sb.append(s.charAt(i+1));
				}
			}
		}
		System.out.println(sb.toString());
	}
}