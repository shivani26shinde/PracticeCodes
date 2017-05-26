# Minimum number of jumps to reach end

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int JumpsN(int[] array){
		int ladder = array[0];
		int stairs = array[0];
		int jump = 1;
		for(int i=1;i<array.length;i++){
			if(ladder < i+array[i]){
				ladder = i+array[i];
			}
			stairs--;
			if(stairs==0){
				jump++;
				stairs = ladder-i;
			}
		}
		return jump;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(JumpsN(array));
	}
}