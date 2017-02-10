# Powers of two integers
# Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

public class Solution {
    public boolean isPower(int a) {
		# if the given number is one return true 
        if(a==1){
            return true;
        }
		# Only run the loop till the value is less than squareroot of the given number i.e. the given number can be at max a square of some number
        for (int i=2; i<=Math.sqrt(a); i++)
        {
            int j = 2;
            double val = Math.pow(i, j);
            while (val<=a && val>0)
            {
                if (val==a)
                    return true;
                j++;
                val = Math.pow(i, j);
             }
    }
    return false;
    }
}