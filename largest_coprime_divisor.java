# Largest Coprime Divisor

public class Solution {
    public int cpFact(int A, int B) {
	
		// Keep checking for GCD of A and B
		// If equal to 1, return A else, update value of A
        while(gcd(A,B) != 1){
            A = A/gcd(A,B);
        }
        return A;
    }
	
	// Returns GCD of two numbers
    public static int gcd(int a, int b){
        while(a != 0 && b != 0) 
		{
			 int c = b;
			 b = a%b;
			 a = c;
		}
      	return a+b;
    }
}
