package com.indef.sorting;

public class QuickSort {
	
	private int[] listToSort;
	
	public void sort(int[] listToSort){
		if(listToSort == null || listToSort.length == 0){
			return;
		}
		
		this.listToSort = listToSort;
		
		quickSort(0, listToSort.length - 1);
	}
	
	private void quickSort(int start, int end){
		
		if(start < end){
			int splitPoint = partition(start,end);
			quickSort(start,splitPoint - 1);
			quickSort(splitPoint + 1,end);
		}
	}
	
	private int partition(int start, int end){
		
		int pivotValue = listToSort[start];
		int leftmark = start;
		int rightmark = end;
		int temp;
		boolean done = false;
		
		while(!done){
			
			while(leftmark <= rightmark && listToSort[leftmark] <= pivotValue){
				leftmark += 1;
			}
			
			while(listToSort[rightmark] >= pivotValue && rightmark >= leftmark){
				rightmark -= 1;
			}
			
			if(rightmark < leftmark){
				done = true;
			}else{
				temp = listToSort[rightmark];
				listToSort[rightmark] = listToSort[leftmark];
				listToSort[leftmark] = temp;
				leftmark += 1;
				rightmark -= 1;
			}			
		}
		
		//split point is found so exchange the pivot with value at split point
		temp = listToSort[rightmark];
		listToSort[rightmark] = listToSort[start];
		listToSort[start] = temp;
		
		return rightmark;
	}
	
	private void printSortedList(){
		System.out.println("Sorted list using Quick Sort");
		for(int num : listToSort){
			System.out.println(num);
		}
	}
	
	public static void main(String args[]){
		QuickSort qSort = new QuickSort();
		//int[] test = {54,26,93,17,77,31,44,55,20};
		int[] test = {17,26,20};
		qSort.sort(test);
		qSort.printSortedList();
	}
	
	
}
