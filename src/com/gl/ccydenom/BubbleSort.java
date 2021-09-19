package com.gl.ccydenom;

class BubbleSort {
	
	int[] bubbleSort(int[] arr) {
		
		for (int j = 0; j < arr.length; j++) {
			
			for (int i=0; i < arr.length - 1 - j; i++) {
				
				if (arr[i] < arr[i+1]) {
					arr[i] = arr [i] + arr[i+1];
					arr[i+1] = arr[i] - arr[i+1];
					arr[i] = arr[i] - arr[i+1];
				}
				
			}
			
		}
		/*
		System.out.println("The sorted elements are ");
		for (int k=0; k < arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
		*/
		return(arr);
		
	}
	
}
