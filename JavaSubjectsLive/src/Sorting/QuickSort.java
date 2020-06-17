package Sorting;

public class QuickSort {
	
	
	public void quick(int array[],int left,int right) {
		int index=partition(array,left,right);
		if(left<index-1) {
			partition(array,left,index-1);	
		}if(index<right) {
			partition(array,index,right);	
		}
		
	}

	private int partition(int[] array, int left, int right) {
	int pivot=array[(left+right/2)];
	while(array[left]<pivot) {left++;}
	while(array[right]>pivot) {right--;}
	if(left<=right) {
		int temp=array[left];
		array[left]=array[right];
		array[right]=temp;
		left++;
		right--;
		
	}
		return left;
	}

}
