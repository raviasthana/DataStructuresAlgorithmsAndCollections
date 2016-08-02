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
		if(start < end){
			int mid = (start+end)/2;
			//recursively call merge sort till list
			//is split into halves of single item
			mergeSort(aList,start,mid); //call merge sort on left half
			mergeSort(aList,mid+1,end);	//call merge sort on right half
			/*
			 * Once the mergeSort function is invoked on the left half
			 * and the right half, it is assumed they are sorted.
			 * The rest of the process is responsible for merging the
			 * two smaller sorted list into larger sorted list.
			 */
			merge(aList,start,mid,end);
		}
	}
	
	private void merge(int[] aList, int start, int mid, int end){
		//System.out.println("merge called[start = " + start + ", mid = " + mid + ", end = " + end + "]");
		int left = start;
		int right = mid + 1;
		int k = start;
		
		//temporary list used to sort sub lists
		int[] mergedList = new int[aList.length];
		/*
		 * merge the left and right half
		 * left half from (start to mid) index
		 * right half from (mid+1 to end) index
		 * 
		*/
		while((left <= mid) && (right <= end)){
			if(aList[left] > aList[right]){
				mergedList[k] = aList[right];
				k += 1;
				right += 1;
			}else{
				mergedList[k] = aList[left];
				k += 1;
				left += 1;
			}
		}
		//if any item in the LEFT HALF are still remaining 
		//after merging in first step then copy them into
		//merged list
		while(left <= mid){
			//System.out.println("k=" + k + ", left="+left);
			mergedList[k] = aList[left];
			k += 1;
			left += 1;
		}
		//if any item in the RIGHT HALF are still remaining 
		//after merging in first step then copy them into
		//merged list		
		while(right <= end){
			mergedList[k] = aList[right];
			k += 1;
			right += 1;
		}
		
		//now mergedList[] is the sorted list at current recursion level
		//copy items from merged list (which is sorted) to original list 
		while(k > start){
			k = k-1;
			aList[k] = mergedList[k];
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
		//int[] listToSort = {54,26,93,17,77,31,44,55,20};
		int[] listToSort = {6,1,2,4,5,3,5,6,2};
		mSort.sort(listToSort);
	}

}
