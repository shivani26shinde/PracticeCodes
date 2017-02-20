# Merge Sort
# Worse-case complexity: O(nlogn)
	
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// Input array
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = n-1;
		int arrtemp[] = new int[n];
		Sort(start, end, arr);
		
		// Print sorted array
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	// Divides the array into single elements, sorts and merges
	public static void Sort(int start, int end, int arr[]){
	
		// Recursively Sort
		if(start < end){
			int mid = (start+end)/2;
			Sort(start, mid, arr);
			Sort(mid+1, end, arr);
			// Merge the sorted elements
			Merge(start, mid, end, arr);
		}
	}
	
	// Compare the elements and merge
	public static void Merge(int start, int mid, int end, int arr[]){
		int  s = start;
		int temp = mid+1;
		int var = start;
		
		// temporary array created for storage
		int arrtemp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrtemp[i] = arr[i];
		}
		
		// compare elemnts and change their positions in final array
		while(s <= mid && temp <= end){
			if(arrtemp[s] < arrtemp[temp]){
				arr[var] = arrtemp[s];
				var++;
				s++;
			}
			else{
				arr[var] = arrtemp[temp];
				var++;
				temp++;
			}
		}
		// first half of the array had elements > in value than the second half
		while(s<=mid){
			arr[var] = arrtemp[s];
			var++;
			s++;
		}
	}
}
