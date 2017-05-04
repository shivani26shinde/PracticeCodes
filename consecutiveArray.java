# Consecutive Array

import java.util.*;
import java.lang.*;
import java.io.*;

class ConsecutiveArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(2,1,10,5,7,8,3));
		int max=0;
		for(int i:set){
			if(!set.contains(i-1)){
				int l = 1;
				while(set.contains(i+1)){
					i++;
					l++;
				}
				max = Math.max(max, l);
			}
		}
		System.out.println(max);
	}
}