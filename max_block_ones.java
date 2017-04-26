# Max square of 1's (BFS)

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] table = new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				table[i][j] = 0;
			}
		}
		table[0][3] = 1;
		table[1][1] = 1;
		table[1][2] = 1;
		table[1][3] = 1;
		table[2][1] = 1;
		table[2][2] = 1;
		table[3][1] = 1;
		table[2][3] = 1;
		table[3][2] = 1;
		table[3][3] = 1;
		int[] arr = new int[1];
		arr[0] = 1;
		int max = 0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		int size = 1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(table[i][j] == 1){
					table[i][j] = getSize(table, i, j, arr);
					if(max < table[i][j]){
						max = table[i][j];
					}
				}
			}
		}
		System.out.println(max);
	}
	public static int getSize(int[][] table, int row, int col, int[] arr){
		if(row == 0 || col == 0 || row == 3 || col == 3){
			return table[row][col];
		}
		if(table[row][col] == 0){
			return 0;
		}
		arr[0] += getSize(table, row, col+1, arr) & getSize(table, row+1, col, arr) & getSize(table, row+1, col+1, arr);
		return arr[0];
	}
}
