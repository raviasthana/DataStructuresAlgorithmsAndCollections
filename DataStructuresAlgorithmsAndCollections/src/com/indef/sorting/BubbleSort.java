package com.indef.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		//int a[] = {5,1,6,2,4,3};
		int a[] = {6,5,4,3,2,1};
		int nItems = a.length;
		int temp = 0;
		boolean sorted = true;
		
		for(int i=0; i<nItems; i++){
			sorted = true;
			for(int j=0; j<nItems-i-1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false;
				}
			}
			//System.out.println("i[" + i + "]");
			if(sorted) break;
		}
		
		System.out.println("Sorted Array using Bubble Sort:");
		for(int i=0; i<nItems; i++){
			System.out.println(a[i]);
		}
	}
}
