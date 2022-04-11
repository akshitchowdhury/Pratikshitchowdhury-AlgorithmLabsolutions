package com.glLab;
import java.util.Scanner;
public class PaymentsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---Welcome to Pay Money---");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the transaction size : ");
	int size = sc.nextInt() ;
	int arr[] = new int [size];
	
	//input Values of the transcations
	System.out.println("Enter the values of transaction : ");
	for(int i= 0; i<size; i++) {
		
		arr[i] = sc.nextInt();
		
	}
	
	//display transaction list
	System.out.println("The list of your transacion are listed below : ");
	for(int i = 0; i<size; i++) {
		
		System.out.print(" "+ arr[i]);
	}
	
	//Target numbers input
	System.out.println(" ");
	System.out.println("Enter the no of total targets that is needed to be achieved");
	int targetno = sc.nextInt();
	for(int i = 1; i<= targetno; i++) {
	//Target value 1
	System.out.println("Enter the value of " + i+ " target" );
	int value = sc.nextInt();
	
	//Logic calculation
	
	for(int j = 0; j<size; j++) {
		int sum =+ arr[j];
		if(sum>= value) {
			System.out.println("Target value achieved after" + (j+1) + " transactions" );
			break;
		
		}
		
		if(sum == 0) {
			System.out.println("Target unable to be achieved. ");
		}
		
	}
	
	}
	
	
	
	
	}

	
	
	
}
