package com.indef.sorting;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;

public class QuickSortTest {

	private int[] listToSort;
	private static final int SIZE = 7;
	private static final int MAX = 99;
	private QuickSort qSort;
	
	@Before
	public void setIp() throws Exception{
		listToSort = new int[SIZE];
		Random generator = new Random();
		for(int i=0; i < listToSort.length; i++){
			listToSort[i] = generator.nextInt(MAX);
		}
		
		qSort = new QuickSort();
	}
	
	@Test
	public void testNull(){
		qSort.sort(null);
	}
	
	@Test
	public void testEmpty(){
		qSort.sort(new int[0]);
	}
	
	@Test
	public void testSimple(){
		int[] simple = {5};
		qSort.sort(simple);
	}
	
	@Test
	public void testSpecial(){
		int[] listToSort = {5,5,6,6,4,4,5,5,4,4,6,6,5,5};
		qSort.sort(listToSort);
		
		if(!isSortedList(listToSort)){
			fail("This should not happen");
		}
	}
	
	@Test
	public void testQuickSort(){
		System.out.println("Unsorted List");
		printList(listToSort);
		qSort.sort(listToSort);
		if(!isSortedList(listToSort)){
			fail("This should not happen");
		}
		System.out.println("Sorted List using QuickSort");
		printList(listToSort);
	}
	
	private boolean isSortedList(int[] sortedList){
		
		for(int i=0; i<sortedList.length - 1; i++){
			if(sortedList[i] > sortedList[i+1]){
				return false;
			}
		}
		
		return true;
	}
	
	private void printList(int[] sortedList){
		for(int num : sortedList){
			System.out.println(num);
		}
	}
}
