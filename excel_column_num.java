# Excel Column numbers

public class Solution {
	public int titleToNumber(String a) {
	    int len = a.length();
	    char t = a.charAt(len-1);
	    if(len == 1){
	        int asci = (int) t;
	        int val1 = asci - 64;
	        return val1;
	    }
	    int var = 0;
	    double val = 0;
	    for(int i = len-1; i >= 0; i--){
	        char c = a.charAt(i);
	        val = val + Math.pow(26,var) * (c-'A'+1) ;
	        var++;
	    }
	    return (int)val;
	}
}
