package com.LAb2;
import java.util.Scanner;
public class Currencydriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner object created for taking the input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the currency list : ");
		int size = sc.nextInt();
		int curr[] = new int[size];
		
		System.out.println("Enter the currency denominations value : ");
		
		//for loop for storing the currncy denominations values in the curr array
			for(int i= 0; i<size; i++) {
				
				curr[i] = sc.nextInt();
				}
			
			//sorted array function and display
			
			Currency obj = new Currency();
			obj.currencysorter(curr);
			
			//amount value
			System.out.println(" ");
			System.out.println("Enter your amount you want to pay");
			int amount = sc.nextInt();
			
			//amount checker via creating an objct chker that calls the method "noteImplementation" from Currency class
			
			Currency chker = new Currency();
			chker.noteImplementation(curr, amount);
			
			
			
			
			
			
		    }
			
			
			
			
			}		


	

