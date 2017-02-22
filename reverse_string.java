# Reverse the string

public class Solution {
	public String reverseWords(String a) {
	    int n = a.length();
	    ArrayList<ArrayList<Character>> array = new ArrayList<ArrayList<Character>>();
		
	    if(n==0){
	        return a;
	    }
		
	    for(int i=0; i<n; i++){
	        ArrayList<Character> str = new ArrayList<Character>();
	        while(i<n && a.charAt(i) != ' '){
	            str.add(a.charAt(i));
	            i++;
	        }
	        if(str.size() != 0){
	            array.add(str);
	        }  
	    }
		
	    Collections.reverse(array);
	    int num = array.size();
		
		if(num == 1){
		  StringBuilder sb = new StringBuilder();
			for(int j=0; j<array.get(0).size(); j++){
				sb.append(array.get(0).get(j));
			}
			String curr = sb.toString(); 
			return curr;
		}
		
		StringBuilder sbnow = new StringBuilder();
		for(int i=0;i<num-1;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<array.get(i).size(); j++){
				sb.append(array.get(i).get(j));
			}
			sbnow.append(sb);
			sbnow.append(" ");
		}
		
		StringBuilder sbf = new StringBuilder();
		for(int j=0; j<array.get(num-1).size(); j++){
			sbf.append(array.get(num-1).get(j));
		}
		
		sbnow.append(sbf);
		String now = sbnow.toString();
		return now;
		}
}
