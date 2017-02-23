# Json

public class Solution {
	public ArrayList<String> prettyJSON(String a) {
	    ArrayList<String> list = new ArrayList<String>();
	    int len = a.length();
	    if(len == 0){
	        return null;
	    }
	    int exh = 0;
	    int tab = 0;
	    while(exh <= len-1){
	        Queue<Character> queue = new LinkedList<Character>();
	        while(exh <= len-1 && a.charAt(exh) != '[' && a.charAt(exh) != '{' && a.charAt(exh) != '}'
	        && a.charAt(exh) != ']' && a.charAt(exh) != ','){
	            queue.add(a.charAt(exh));
	            exh++;
	        }
	        if(exh <= len-1 && queue.peek() != null){
	            String string = "";
                while( queue.peek() != null ){
                    string = string + queue.remove(); 
                }
                if(exh <= len-1 && a.charAt(exh) == ','){
                    string = string + a.charAt(exh); 
                    list.add(string);
                    exh++;
                }
                else if(exh <= len-1 && a.charAt(exh) == '[' || a.charAt(exh) == '{'){
                    if(tab > 0){
                       for(int k=0;k<tab;k++){
                           string = string + '\t';
                       } 
                    }
                    list.add(string);
                    String str = "";
                    str = str + a.charAt(exh); 
                    list.add(str);
                    exh++;
                    tab++;
                }
                else{
                    list.add(string);
                    String str = "";
                    if(tab > 0){
                       for(int k=tab;k>0;k--){
                           str = str + '\t';
                       } 
                    }
                    str = str + a.charAt(exh); 
                    list.add(str);
                    exh++;
                }
	        }
	        else if(exh <= len-1 && queue.peek() == null){
	            String str = "" + a.charAt(exh);
                list.add(str);
                exh++;
	        }
	    }
	    return list;
	}
}
