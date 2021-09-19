package com.gl.ccydenom;
import java.util.Scanner;

class CcyDenom {
	
	private int ccyDenomSize;
	private int payAmt;
	
	public void ccyDenom() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of currency denominations ");
		ccyDenomSize = sc.nextInt();
		
		int[] ccyDenomVal = new int[ccyDenomSize];
		int[] ccyDenomValSorted = new int[ccyDenomSize];
		
		for (int i=0; i< ccyDenomSize; i++) {
			System.out.println(" Enter the value of element " +(i+1));
			ccyDenomVal[i] = sc.nextInt();
		}
		
		System.out.println(" Enter the amount you'd like to pay ");
		payAmt = sc.nextInt();
		
		BubbleSort bsort = new BubbleSort();
		ccyDenomValSorted = bsort.bubbleSort(ccyDenomVal);
		
		/*
		for (int i=0; i< ccyDenomSize; i++) {
			System.out.println(" The value of element " +(i+1) + " is " + ccyDenomValSorted[i]);
		}
		*/
		
		NotesCount notesCount = new NotesCount();
		notesCount.NotesCountImpl(ccyDenomValSorted, payAmt);
		
		sc.close();
	}
	
}
