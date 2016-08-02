package com.indef.sorting;

public class MergeSort {

	public void sort(int[] aList){
		if(aList == null || aList.length == 0){
			return;
		}else{
			mergeSort(aList, 0, aList.length-1);
			printList(aList);
		}
	}
	
	private void mergeSort(int[] aList, int start, int end){
		//System.out.println("start = " + start + ", end = " + end);
		int[] mergedList = new int[aList.length];
		if(start < end){
			int mid = (start+end)/2;
			mergeSort(aList,start,mid);
			mergeSort(aList,mid+1,end);
			merge(aList,mergedList,start,mid,end);
		}
	}
	
	private void merge(int[] a, int[] mergedList, int start, int mid, int end){
		//System.out.println("merge called[start = " + start + ", mid = " + mid + ", end = " + end + "]");
		int left = start;
		int right = mid + 1;
		int k = start;
		
		while((left <= mid) && (right <= end)){
			if(a[left] > a[right]){
				mergedList[k] = a[right];
				k += 1;
				right += 1;
			}else{
				mergedList[k] = a[left];
				k += 1;
				left += 1;
			}
		}
		
		while(left <= mid){
			//System.out.println("k=" + k + ", left="+left);
			mergedList[k] = a[left];
			k += 1;
			left += 1;
		}
		
		while(right <= end){
			mergedList[k] = a[right];
			k += 1;
			right += 1;
		}
		
		//now mergedList[] is the sorted list at current merge level
		//so merge it back to original list
		while(k > start){
			k = k-1;
			a[k] = mergedList[k];
		}
	}
	
	private void printList(int[] list){
		System.out.println("Printed list using Merge Sort");
		for(int num : list){
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		MergeSort mSort = new MergeSort();
		int[] listToSort = {54,26,93,17,77,31,44,55,20};
		mSort.sort(listToSort);
	}

}
