# Roman to Integer

public class Solution {
	public int romanToInt(String a) {
	    int val = 0;
	    
	    int len = a.length();
	    for(int i=len-1; i>=0; i--){
	        if(a.charAt(i) == 'V'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+5; 
	            }
	        }
	        else if(a.charAt(i) == 'X'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+10; 
	            }
	        }
	        else if(a.charAt(i) == 'L'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+50; 
	            }
	        }
	        else if(a.charAt(i) == 'C'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+100; 
	            }
	        }
	        else if(a.charAt(i) == 'D'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+500; 
	            }
	        }
	        else if(a.charAt(i) == 'M'){
	            if(a.charAt(i-1) != 'I' || a.charAt(i-1) != 'X' || a.charAt(i-1) != 'C'){
	               val = val+1000; 
	            }
	        }
	        else if(a.charAt(i) == 'I'){
	            int count = 1;
	            while(a.charAt(i) == a.charAt(i-1)){
	                count++;
	                i--;
	            }
	            if(a.charAt(i+1) == 'V' || a.charAt(i+1) == 'X' || a.charAt(i+1) == 'L' || a.charAt(i+1) == 'C' || a.charAt(i+1) == 'D' || 
	            a.charAt(i+1) == 'M'){
	               val = val-count*1; 
	            }
	            else if(a.charAt(i-1) == 'V' || a.charAt(i-1) == 'X' || a.charAt(i-1) == 'L' || a.charAt(i-1) == 'C' || a.charAt(i-1) == 'D' || 
	            a.charAt(i-1) == 'M'){
	               val = val+count*1; 
	            }
	        }
	        else if(a.charAt(i) == 'X'){
	            int count = 1;
	            while(a.charAt(i) == a.charAt(i-1)){
	                count++;
	                i--;
	            }
	            if(a.charAt(i+1) == 'V' || a.charAt(i+1) == 'X' || a.charAt(i+1) == 'L' || a.charAt(i+1) == 'C' || a.charAt(i+1) == 'D' || 
	            a.charAt(i+1) == 'M'){
	               val = val-count*10; 
	            }
	            else if(a.charAt(i-1) == 'V' || a.charAt(i-1) == 'X' || a.charAt(i-1) == 'L' || a.charAt(i-1) == 'C' || a.charAt(i-1) == 'D' || 
	            a.charAt(i-1) == 'M'){
	               val = val+count*10; 
	            }
	        }
	        else if(a.charAt(i) == 'C'){
	            int count = 1;
	            while(a.charAt(i) == a.charAt(i-1)){
	                count++;
	                i--;
	            }
	            if(a.charAt(i+1) == 'V' || a.charAt(i+1) == 'X' || a.charAt(i+1) == 'L' || a.charAt(i+1) == 'C' || a.charAt(i+1) == 'D' || 
	            a.charAt(i+1) == 'M'){
	               val = val-count*100; 
	            }
	            else if(a.charAt(i-1) == 'V' || a.charAt(i-1) == 'X' || a.charAt(i-1) == 'L' || a.charAt(i-1) == 'C' || a.charAt(i-1) == 'D' || 
	            a.charAt(i-1) == 'M'){
	               val = val+count*100; 
	            }
	        }
	        else{
	            return 0;
	        }
	    }
	    return val;
	}
}
