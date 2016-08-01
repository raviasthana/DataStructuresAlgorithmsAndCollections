package com.indef.sorting;

public class MergeSort {

	public void sort(int[] aList){
		if(aList == null || aList.length == 0){
			return;
		}else{
			mergeSort(aList, 0, aList.length-1);
		}
	}
	
	private void mergeSort(int[] aList, int start, int end){
		System.out.println("start = " + start + ", end = " + end);
		if(start < end){
			int mid = (start+end)/2;
			mergeSort(aList,start,mid);
			mergeSort(aList,mid+1,end);
			merge(aList,start,mid,end);
		}
	}
	
	private void merge(int[] a,int start, int mid, int end){
		
		System.out.println("merge called[start = " + start + ", mid = " + mid + ", end = " + end);
		
	}
	
	public static void main(String[] args) {
		MergeSort mSort = new MergeSort();
		int[] listToSort = {54,26,93,17,77,31,44,55,20};
		mSort.sort(listToSort);
	}

}
