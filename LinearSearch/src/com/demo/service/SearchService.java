//Store data in array and position for all the occurrences of the given number

package com.demo.service;

import java.util.Scanner;

public class SearchService {

	public void acceptArrayElements(int[] arr) {		//accept array elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	}

	public void displayAll(int[] arr) {			//display array elements
		
		System.out.println("Array elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

	public void displayPositionOfOccr(int[] arr, int val) {	//positions of occurrences for given no.
		System.out.println(val+" : ");
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==val) {
				System.out.println("--At index--"+i);		//display index where no found
			}
		}
		
	}
	
	
	
}
