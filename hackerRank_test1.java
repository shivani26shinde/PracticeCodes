// Find the maximum degree element with minimum sub-array length

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {1,1,1,1,2,2,1,2,2,2};
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> start = new HashMap<>();
		HashMap<Integer, Integer> end = new HashMap<>();
		for(int i=0;i<array.length;i++){
			if(map.containsKey(array[i])){
				int val = map.get(array[i]);
				map.put(array[i], val+1);
				end.put(array[i], i);
			}
			else{
				map.put(array[i], 1);
				start.put(array[i], i);
			}
		}
		int maxVal = Collections.max(map.values());
		ArrayList<Integer> list = new ArrayList<>();
		for(Integer i: map.keySet()){
			if(map.get(i) == maxVal){
				list.add(i);
			}
		}
		ArrayList<Integer> minVal = new ArrayList<>();
		for(int i=0;i<list.size();i++){
			if(start.containsKey(list.get(i))){
				int s = start.get(list.get(i));
				if(end.containsKey(list.get(i))){
					int e = end.get(list.get(i));
					minVal.add(e-s+1);
				}
				else{
					minVal.add(1);
				}
			}
		}
		System.out.println(Collections.min(minVal));
	}
}
