# Power of number

import java.util.*;
import java.lang.*;
import java.io.*;

class Power
{
	public static int PowerBits(int x, int y){
		int ans = 1;
		while(y>0){
			if((y&1) == 1){
				ans = ans*x;
			}
			y = y>>1;
			x = x*x;
		}
		return ans;
	}
	public static int PowerRec(int x, int y){
		if(y==0){
			return 1;
		}
		int temp = PowerRec(x, y/2);
		if(y%2 == 0){
			return temp*temp;
		}
		else{
			return x*temp*temp;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int x = 5;
		int y = 5;
		System.out.println(PowerBits(x, y));
		System.out.println(PowerRec(x, y));
	}
}