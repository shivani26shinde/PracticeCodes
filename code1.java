/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1, 1 , 1};
		ArrayList<Integer> array = new ArrayList<Integer>();
		HashMap hash = new HashMap();
		for(int i=0;i<arr.length;i++){
		    array.add(arr[i]);
		}
		int sum = 0;
		hash.put(0, array.get(0));
		sum = (int) hash.get(0);
		for(int i=1;i<array.size();i++){
		    for(int j=1;j<=arr.length;j++){
		        if(hash.containsValue((array.get(i)))){
		            array.set(i, array.get(i)+1);
		        }else{
		            hash.put(i, array.get(i));
		            sum += (int) hash.get(i);
		            break;
		        }
		    }
		}
		return sum;
	}
}