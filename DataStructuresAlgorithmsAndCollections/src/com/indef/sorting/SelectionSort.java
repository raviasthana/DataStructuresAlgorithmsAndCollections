package com.indef.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {3,6,8,1,4,5};
		int sNum,sIndex=0;
		int nItems = a.length;
		for(int i=0; i<nItems; i++){
			sNum = a[i];
			for(int j=i+1; j<nItems; j++){
				if(a[j] < sNum){
					sNum = a[j];
					sIndex=j;
				}
			}
			a[sIndex] = a[i];
			a[i] = sNum;
		}
		
		System.out.println("Sorted Array using Selection Sort:");
		for(int i=0; i<nItems; i++){
			System.out.println(a[i]);
		}		
	}

}
