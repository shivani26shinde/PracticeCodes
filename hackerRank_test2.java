//Check for proper locking and unlocking

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] array = {"ACQUIRE 84", "ACQUIRE 60", "REQUEST 60", "REQUEST 84", "ACQUIRE 60", "REQUEST 60"};
		Set<String> set = new HashSet<>();
		Stack<String> st = new Stack<>();
		int val = 1;
		for(int i=0;i<array.length;i++){
			String[] spt_push = array[i].split(" ");
			if(st.isEmpty() || (spt_push[0].equals("ACQUIRE") && !set.contains(spt_push[1]))){
				st.push(array[i]);
				set.add(spt_push[1]);
			}
			else{
				String[] spt_pop = (st.peek()).split(" ");
				if(spt_push[0].equals("ACQUIRE") && set.contains(spt_push[1])){
					val = 0;
				}
				else if(spt_push[0].equals("REQUEST") && spt_pop[0].equals("ACQUIRE") && spt_push[1].equals(spt_pop[1])){
					st.pop();
				}
				else{
					val = 0;
				}
			}
		}
		if(st.isEmpty() || val == 1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}