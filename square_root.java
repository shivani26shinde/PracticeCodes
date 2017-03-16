# Square root of a number

public class Solution {
	public int sqrt(int a) {
	
	// number is 1
		if(a == 1){
			return 1;
		}
		
	// number is 0
		if(a == 0){
			return 0;
		}
		
		double begin = 0;
		double end = 1+(a/2);

	// Binary serach to check the square root
		while(end-begin != 0){
			begin = end;
			end = (1/2.0)*(begin + a/begin);
		}
		return (int) end;
	}
}

