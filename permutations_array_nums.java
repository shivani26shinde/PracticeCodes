# Permutations of numbers in an array

import java.util.*;
import java.lang.*;
import java.io.*;

class Permutations_Num
{
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int[] array = new int[]{1,2,3};
	
	public static void permutations(int a){
		if(a >= array.length){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i=0;i<array.length;i++){
				temp.add(array[i]);
			}
			list.add(temp);
			return;
		}
		for(int i=a;i<array.length;i++){
			swap(a, i);
			permutations(a+1);
			swap(a, i);
		}
	}
	public static void swap(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		permutations(0);
		System.out.println(Arrays.toString(list.toArray()));
	}
}