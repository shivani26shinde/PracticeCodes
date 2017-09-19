// Calculate the runs in a baseball match

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] limit = new int[]{10,20,10,30,10,40,30,20};
		int[][] speed = new int[limit.length][3];
		Random rand = new Random();
		for(int i=0;i<limit.length;i++){
			System.out.println(i);
			for(int j=0;j<3;j++){
				speed[i][j] = rand.nextInt(20) + 1;
			}
		}
		int ans = Calculate(limit, speed);
		System.out.println(ans);
	}
	public static int Calculate(int[] limit, int [][] speed){
		Queue<Integer> que= new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		int run = 0;
		for(int i=0;i<limit.length;i++){
			for(int j=0;j<3;j++){
				if(speed[i][j] <= limit[i]){
					que.add(i);
					set.add(i);
					break;
				}
			}
			if(set.contains(i)){
				if(que.size()>=4){
					run++;
				}
			}
		}
		return run;
	}
}