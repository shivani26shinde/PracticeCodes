# Quicksort (Center element is always the pivot)
Average-case complexity: O(nlogn)
Worse-case complexity: O(n^2)

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
		int mid = (first+last)/2;
		int pivot = arr[mid];
		int temp1 = first-1;
		for(int i=first;i<=last;i++){
			if( pivot > arr[i]){
				temp1++;
				int val = arr[temp1];
				arr[temp1] = arr[i];
				arr[i] = val;
			}
		}
		int val1 = arr[temp1+1];
		arr[temp1+1] = pivot;
		pivot = val1;
		return temp1+1;
	}
}