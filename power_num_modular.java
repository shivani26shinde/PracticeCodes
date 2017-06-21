# Power of number

public class Solution {
	public int pow(int x, int n, int d) {
	    if(x==0 & n==0){
	        return 0;
	    }
	    long res = 1L;
        long a = x;
	    while(n>0){
	        if((n&1) == 1){
	            res = res*a;
	            res = res%d;
	        }
	        n = n>>1;
	        a = a*a;
	        a = a%d;
	    }
	    res = res+d;
	    return (int)res%d;
	}
}
