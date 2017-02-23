# Quicksort (Last element is always the pivot)

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int first = 0;
		int last = n-1;
		Quicksort(arr, first, last);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
	public static void Quicksort(int arr[], int first, int last){
		if(first < last){
			int pivot = Divide(arr, first, last);
			Quicksort(arr, first, pivot-1);
			Quicksort(arr, pivot+1, last);
		}
	}
	public static int Divide(int arr[], int first, int last){
		int pivot = arr[last];
		int temp = first-1;
		for(int i=first;i<last;i++){
			if(pivot > arr[i]){
				temp++;
				int val = arr[temp];
				arr[temp] = arr[i];
				arr[i] = val;
			}
		}
		int val = arr[temp+1];
		arr[temp+1] = arr[last];
		arr[last] = val;
		return temp+1;
	}
}