package Sorting;

public class QuickSort1 {
	public static void main(String[] args) {
		int arr[]= {2,3,6,3,4,8,3,6,8};
		sort(arr,0,arr.length-1);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	static void sort(int arr[],int left,int right) {
		int index=partition(arr,left,right);
		if(left<index-1)
			partition(arr,left,index-1);
		
		if(index<right) {
			partition(arr,index,right);
		}
	}

	private static  int partition(int[] arr, int left, int right) {
	int pivot=arr[(left+right)/2];
	while(arr[left]<pivot) left++;
	while(arr[right]>pivot)right--;
	if(left<=right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
	}
		return left;
	}

}
