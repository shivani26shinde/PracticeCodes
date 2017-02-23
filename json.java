# Pretty Json

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
	            if(tab > 0){
                   for(int k=0;k<tab;k++){
                       string = string + '\t';
                   } 
                }
                while( queue.peek() != null ){
                    string = string + queue.remove(); 
                }
                if(exh <= len-1 && a.charAt(exh) == ','){
                    string = string + a.charAt(exh); 
                    list.add(string);
                    exh++;
                }
                else if(exh <= len-1 && a.charAt(exh) == '[' || a.charAt(exh) == '{'){
                    list.add(string);
                    String str = "";
                    if(tab > 0){
                        for(int k=0;k<tab;k++){
                           str = str + '\t';
                        } 
                    }
                    str = str + a.charAt(exh); 
                    list.add(str);
                    exh++;
                    tab++;
                }
                else{
                    tab--;
                    list.add(string);
                    String str = "";
                    if(tab > 0){
                        for(int k=0;k<tab;k++){
                           str = str + '\t';
                        } 
                    }
                    str = str + a.charAt(exh); 
                    if(exh <= len-1 && a.charAt(exh) == ','){
                        str = str + a.charAt(exh); 
                        list.add(str);
                        exh++;
                    }
                    else{
                        list.add(str);
                    }
                }
	        }
	        else if(exh <= len-1 && queue.peek() == null){
	            String string = "";
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
                    string = string + a.charAt(exh); 
                    list.add(string);
                    exh++;
                    tab++;
                }
                else{
                    tab--;
                    if(tab > 0){
                        for(int k=0;k<tab;k++){
                           string = string + '\t';
                        } 
                    }
                    string = string + a.charAt(exh); 
                    exh++;
                    if(exh <= len-1 && a.charAt(exh) == ','){
                        string = string + a.charAt(exh); 
                        list.add(string);
                        exh++;
                    }
                    else{
                        list.add(string);
                    }
                }
	        }
	    }
	    return list;
	}
}
