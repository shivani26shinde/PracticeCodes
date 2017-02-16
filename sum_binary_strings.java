# Add two binary strings

public class Solution {
	public String addBinary(String a, String b) {
	    int lenA = a.length();
	    int lenB = b.length();
	    StringBuilder sb = new StringBuilder();
	    if(lenA == 0 || lenB == 0){
	        return null;
	    }
	    int s1 = lenA-1;
	    int s2 = lenB-1;
	    if(s1 > s2){
	        int temp = 10;
	        while(s1 >= 0 && s2 >= 0){
                int ans = Value(a.charAt(s1), b.charAt(s2), temp);
                if(ans/10 == 0){
                    sb.append(ans); 
                }
                else{
                    sb.append(ans%10);
                    temp = ans/10;
                }
                s1--;
                s2--;
            }
            while(s1 >= 0){
              int ans = Value(a.charAt(s1), 0, temp);
                if(ans/10 == 0){
                    sb.append(ans); 
                }
                else{
                    sb.append(ans%10);
                    temp = ans/10;
                }
                s1--;  
            }
	    }
	    else if(s1 < s2){
	        int temp = 10;
	        while(s1 >=0 && s2 >=0){
                int ans = Value(a.charAt(s1), b.charAt(s2), temp);
                if(ans/10 == 0){
                    sb.append(ans); 
                }
                else{
                    sb.append(ans%10);
                    temp = ans/10;
                }
                s1--;
                s2--;
            }
            while(s2 >= 0){
              int ans = Value(0, a.charAt(s2), temp);
                if(ans/10 == 0){
                    sb.append(ans); 
                }
                else{
                    sb.append(ans%10);
                    temp = ans/10;
                }
                s2--;  
            }
	    }
	    else{
	        int temp = 10;
	        while(s1 >=0 && s2 >=0){
                int ans = Value(a.charAt(s1), b.charAt(s2), temp);
                if(ans/10 == 0){
                    sb.append(ans); 
                }
                else{
                    sb.append(ans%10);
                    temp = ans/10;
                }
                s1--;
                s2--;
            }
            sb.append(temp);
	    }
	    return sb.toString();
	}
	public int Value(int a, int b, int c){
	    if(a == 0 && b == 0 && c == 10){
	        return 0;
	    }
	    else if(a == 1 && b == 0 && c == 10){
	        return 1;
	    }
	    else if(a == 0 && b == 1 && c == 10){
	        return 1;
	    }
	    else if(a == 1 && b == 1 && c == 10){
	        return 10;
	    }
	    else if(a == 1 && b == 1 && c == 1){
	        return 11;
	    }
	    else{
	        return 0;
	    }
	}
}
