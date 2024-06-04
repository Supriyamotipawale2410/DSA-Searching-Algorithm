//Store data in array and position for all the occurrences of the given number

package com.demo.test;

import java.util.Scanner;

import com.demo.service.SearchService;

public class TestSearch {

	public static void main(String[] args) {
		SearchService sservice = new SearchService();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");			
		int size = sc.nextInt();					//accept array size from user
		int[] arr = new int[size];
		
		sservice.acceptArrayElements(arr);		//accept array elements
		
		sservice.displayAll(arr);		//display all array elements
		
		System.out.println("Enter value from array to find occurences");
		int val = sc.nextInt();			//accept value from user to find occurrences 
		sservice.displayPositionOfOccr(arr,val); 		//display position of occurrences
		sc.close();
	}

}
