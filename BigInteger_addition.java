# BigInteger Addition (Input: Numbers in string format)

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a = "123456789";
		String b = "1234567";
		int carry = 0;
		int l1 = a.length()-1;
		int l2 = b.length()-1;
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		while(l1 >= 0 || l2 >= 0){
			sum = carry;
			if(l1 >= 0){
				int num1 = Character.getNumericValue(a.charAt(l1));
				sum = sum+num1;
			}
			if(l2 >= 0){
				int num2 = Character.getNumericValue(b.charAt(l2));
				sum = sum+num2;
			}
			if(sum > 9){
				carry = 1;
			}
			else{
				carry = 0;
			}
			sb.append(sum%10);
			l1--;
			l2--;
		}
		if(carry != 0){
			sb.append(carry);
		}
		System.out.println(sb.reverse().toString());
	}
}
