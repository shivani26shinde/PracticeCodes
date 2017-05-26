# All length palindrome partitions

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void partition(String a) {
	    int[][] array = new int[a.length()][a.length()];
	    for(int i=0;i<a.length();i++){
	        array[i][i] = 1;
	        System.out.print(String.valueOf(a.charAt(i))+ " ");
	    }
	    System.out.println();
	    for(int i=0;i<a.length()-1;i++){
	        if(a.charAt(i) == a.charAt(i+1)){
	            array[i][i+1] = 1;
	            System.out.print(a.substring(i, i+2)+ " ");
	        }
	        else{
	            array[i][i+1] = 0;
	        }
	    }
	    System.out.println();
	    for(int i=3;i<=a.length();i++){
	        temp = new ArrayList<>();
	        for(int j=0;j<=a.length()-i;j++){
	            if(a.charAt(j) != a.charAt(j+i-1)){
	                array[j][j+i-1] = 0;
	            }
	            else{
	                array[j][j+i-1] = array[j+1][j+i-2];
	                if(array[j][j+i-1] == 1){
	                    System.out.print(a.substring(j, j+i)+" ");
	                }
	            }
	        }
	        System.out.println();
	    }
	    for(int i=0;i<array.length;i++){
	    	for(int j=0;j<array[0].length;j++){
	    		System.out.print(array[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "cccaacbcaabb";
		partition(s);
	}
}