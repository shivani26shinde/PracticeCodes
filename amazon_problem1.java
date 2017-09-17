// Subset problem with list of lists and array 

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int val = 1;
		String[] array = {"bana", "orange", "apple", "apple", "apple", "bana", "orange","bana"};
		ArrayList<ArrayList<String>> list = new ArrayList<>(Arrays.asList("apple", "apple"));
		ArrayList<String> temp1 = new ArrayList<>();
		list.add(temp1);
		temp1 = new ArrayList<>(Arrays.asList("bana", "any", "bana"));
		list.add(temp1);
		int start = 1;
		for(int s=0;s<list.size();s++){
			ArrayList<String> temp = list.get(s);
			int[][] arr = new int[temp.size()+1][array.length+1];
			for(int m=0;m<arr.length;m++){
				for(int n=0;n<start;n++){
					arr[m][n] = 0;	
				}
			}
			for(int i=1;i<arr.length;i++){
				for(int j=start;j<arr[0].length;j++){
					if(temp.get(i-1).equals(array[j-1]) || temp.get(i-1).equals("any")){
						arr[i][j] = arr[i-1][j-1]+1;
						if(temp.size() == arr[i][j]){
							start = j;
							break;
						}
					}
					else{
						arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
					}
				}
			}
			if(temp.size() != arr[temp.size()][start]){
				System.out.println("BROKE");
				val = 1;
				break;
			}
			else{
				val = 0;
			}
		}
		if(val == 0){
			System.out.println("NOT-BROKE");
		}
	}
}