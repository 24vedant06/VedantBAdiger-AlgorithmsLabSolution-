package com.greatlearning;
import java.util.*;
public class NotesCounter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no of denominations : ");
		int noOfDenominations=scn.nextInt();
		int[] arr = new int[noOfDenominations];
		System.out.println("Enter the denomination values : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the payment amount : ");
		int payment = scn.nextInt();
		System.out.println();
		sortArray(arr);
		countNotes(arr,payment);
	}

	private static void countNotes(int[] arr, int payment) {
		int[] notesCounter = new int[arr.length];
		try {
			for(int i=0;i<arr.length;i++) {
				if(payment>=arr[i]) {
					notesCounter[i] = payment/arr[i];
					payment = payment-notesCounter[i]*arr[i];
				}
			}
			if(payment>0) {
				System.out.println("your payment cannot be achieved with highest denomination");
			}else {
				System.out.println("Your payment denomination will be");
				for(int i=0;i<arr.length;i++) {
					if(notesCounter[i]!=0) {
						System.out.println(arr[i] + " : " + notesCounter[i]);
					}
				}
			}
		
	}
		catch(ArithmeticException e) {
			System.out.println("Denomination cannot be zero");
		}
		
	}

	private static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j+1] = arr[j];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
