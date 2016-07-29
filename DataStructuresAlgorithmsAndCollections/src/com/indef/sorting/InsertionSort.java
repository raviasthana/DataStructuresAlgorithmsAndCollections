package com.indef.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {5,1,6,2,4,3};
		int nItems = a.length;
		int j, key = 0;
		
		for(int i=1; i<nItems; i++){
			key = a[i];
			j = i-1;
			while(j >= 0 && key < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		System.out.println("Sorted Array using Insertion Sort:");
		for(int i=0; i<nItems; i++){
			System.out.println(a[i]);
		}
	}
}
