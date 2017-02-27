# Prime sum

import java.util.*;
import java.lang.*;
import java.io.*;

class Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 3;
		
		// Number has to be greater than 2
		if(n <= 2){
			System.out.print("Not found");
		}
		else{
			while(i<n/2){
			// checks if the sum of two prime numbers is equal to the given number
				if(isPrime(i) == true && isPrime(n-i) == true){
					System.out.print("Found " +i+ "  " +(n-i));
					break;
				}
				i++;
			}
			System.out.println("Not found");
		}
	}
	
	// Checks if the number is prime or not
	public static boolean isPrime(int i){
		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
	
}