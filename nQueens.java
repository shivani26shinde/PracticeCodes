# N Queens problem

import java.util.*;
import java.lang.*;
import java.io.*;

class NQueen
{
	static int N = 4;
	public static boolean Block(int[][] array, int pos){
		if(pos == N){
			return true;
		}
		boolean ans = true;
		int j=0;
		for(int i=pos;i<N;i++){
			while(j<N){
				if(array[i][j] == -1){
					Set(array,i,j);
					ans = Block(array, i+1);
					if(ans == false){
						UnSet(array,i,j);
					}
					else{
						return ans;
					}
				}
				j++;
			}
			if(j == N){
				return false;
			}
		}
		return ans;
	}
	public static void Set(int[][] array, int i, int j){
		for(int s=0;s<N;s++){
			if(array[i][s] == -1){
				array[i][s] = i;
			}
			if(array[s][j] == -1){
				array[s][j] = i;
			}
		}
		int left = i-j;
		int right = i+j;
		for(int s=i+1;s<N;s++){
			for(int t=0;t<N;t++){
				int l = s-t;
				int r = s+t;
				if(l == left && array[s][t] == -1){
					array[s][t] = i;
				}
				if(r == right && array[s][t] == -1){
					array[s][t] = i;
				}
			}
		}
	}
	public static void UnSet(int[][] array, int i, int j){
		for(int s=0;s<N;s++){
			if(array[i][s] == i){
				array[i][s] = -1;
			}
			if(array[s][j] == i){
				array[s][j] = -1;
			}
		}
		int left = i-j;
		int right = i+j;
		for(int s=i+1;s<N;s++){
			for(int t=0;t<N;t++){
				int l = s-t;
				int r = s+t;
				if(l == left && array[s][t] == i){
					array[s][t] = -1;
				}
				if(r == right && array[s][t] == i){
					array[s][t] = -1;
				}
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] array = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				array[i][j] = -1;
			}
		}
		boolean ans = Block(array, 0);
		if(ans == true){
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("No such arrangement possible");
		}
	}
}