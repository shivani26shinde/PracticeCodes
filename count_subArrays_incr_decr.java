// Count of sub-arrays (increasing and decreasing) in a window inside an array

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Window length
		int K = 3;
		int[] array = new int[]{5,2,4,6,7};
		int[] ret1 = new int[array.length-K+1];
		int[] ret2 = new int[array.length-K+1];
		for(int i=0;i<=array.length-K;i++){
			int count1 = 0; int count2 = 0;
			int len1 = 1; int len2 = 1;
			// Count of increasing sub-arrays within the window
			for(int j=i;j<i+K-1;j++){
				if(array[j]<array[j+1]){
					len1++;
				}
				else{
					count1 = count1+(len1*(len1-1)/2);
					len1 = 1;
				}
			}
			if(len1 > 1){
				count1 = count1+(len1*(len1-1)/2);	
			}
			ret1[i] = count1;
			// Count of decreasing sub-arrays within the window
			for(int j=i+K-1;j>i;j--){
				if(array[j]<array[j-1]){
					len2++;
				}
				else{
					count2 = count2+(len2*(len2-1)/2);
					len2 = 1;
				}
			}
			if(len2 > 1){
				count2 = count2+(len2*(len2-1)/2);	
			}
			ret2[i] = count2;
		}
		System.out.println(Arrays.toString(ret1));
		System.out.println(Arrays.toString(ret2));
	}
}