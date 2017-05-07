# Majority element in an array

import java.util.*;
import java.lang.*;
import java.io.*;

class MajorityElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{1,1,4,5,2,9,2,2,2,3,2,2,2,3,2};
		int cand = array[0];
		int count = 1;
		for(int i=1;i<array.length;i++){
			if(count == 0){
				cand = array[i];
				count++;
			}
			else{
				if(array[i] == cand){
				count++;
				}
				else{
					count--;
				}
			}
		}
		int count2 = 0;
		for(int i=0;i<array.length;i++){
			if(array[i] == cand){
				count2++;
			}
		}
		if(count2 > array.length/2){
			System.out.println(cand);
		}
		else{
			System.out.println("NONE");
		}
	}
}