# Sorted Permutation Rank

public class Solution {
	public int findRank(String a) {
	    int len = a.length();
		
		# length of the string is 1
	    if(len==1){
	        return 1%1000003;
	    }
		
		# Store the string in chaacter array
	    ArrayList<String> list = new ArrayList<String>();
	    Character c[] = new Character[len];
	    for(int i=0; i<len; i++){
	        c[i] = a.charAt(i);
	    }
		
		# Sort the string in lexicographic order
	    Arrays.sort(c);
        StringBuilder sb = new StringBuilder(c.length);
        for (char i : c) sb.append(i);
        String fc = sb.toString();
		
		# Calling the permute function
        permute(c, 0, list);
        int ans = list.indexOf(a);
        return ((ans+1)%1000003);
	}
	public static void permute(Character c[], int val, ArrayList<String> list){
	
		# End of the array
		if(val >= c.length - 1){
		
			# Appending the string to the list
			StringBuilder sb = new StringBuilder(c.length);
			for (char i : c) sb.append(i);
        	String fc = sb.toString();
        	list.add(fc);
        	return;
		}
		for(int i=val; i<c.length; i++){
			# Swapping the two elements
      		Character j = c[val];
      		c[val] = c[i];
      		c[i] = j;
			
			# Recursively calling the permute function
      		permute(c, val+1, list);
			
			# Reswappinmg the two elements 
      		j = c[val];
      		c[val] = c[i];
      		c[i] = j;
		}
	}
}
