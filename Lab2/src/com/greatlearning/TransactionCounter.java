package com.greatlearning;
import java.util.*;
public class TransactionCounter {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the no of tranactions");
		int noOfTransactions = scn.nextInt();
		System.out.println("enter the transactions values");
		int arr[] = new int[noOfTransactions];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the no of targets to be achives : ");
		int noOfTargets=scn.nextInt();
		while(noOfTargets--!=0) {
			System.out.println("Entert the value of target : ");
			long targetValue=scn.nextInt();
		 	boolean isTargetAchieved = false;
		 	long Sum = 0;
		 	for(int i=0;i<arr.length;i++) {
		 		Sum = Sum+arr[i];
		 		if(Sum>=targetValue) {
		 			System.out.println("Target has achieved at "+(i+1));
		 			isTargetAchieved = true;
		 			break;
		 		}
		 	}
		 	if(isTargetAchieved==false) {
		 		System.out.println("Your target is not achieved");
		 		
		 	}
		}
	}

}
