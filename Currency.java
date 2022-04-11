package com.LAb2;

public class Currency {

	
	//Bubble sorting algorithm applied to sort the array arr[] in descending order
	
	
	public static void currencysorter(int arr[]) {
			int temp = 0;
			int size = arr.length;
			for(int i = 0; i< size; i++) {
				for (int j = i+1; j< size; j++) {
					if(arr[i]< arr[j]) {
						
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					
					}

					
				}
				System.out.print(" "+ arr[i]+ " ");			
				}
			System.out.print("is your sorted currency list. "); 
			
			
		}
	
	
	//business logic implementaion method
	
	public void noteImplementation (int notes[], int amount) {
		
		int noteStack[] = new int [notes.length];
		try {
			
			
		for(int i = 0; i< notes.length; i++) {
			
			if(amount >= notes[i]) {
				
				noteStack[i] = amount/notes[i];
				amount = amount- noteStack[i]* notes[i];
			}
			}
			if(amount>0) {
				System.out.println("exact amount is unable to be fetched with highest denomination. ");
		}
		
			else {
				System.out.println("Your payment approach in order to get minimum no of notes : ");
				for(int i = 0; i<notes.length; i++) {
					if(noteStack[i] != 0) {
						System.out.println(notes[i]+ ":" + noteStack[i]);
					}
			
					
					
					
				}
			}
		}
	
		
		//Arthmetic Exception placed via try catch function
		catch(ArithmeticException e){
			System.out.println(e + "notes of denomination 0 is invalid. ");
			
			
			
		}
	
	
	}
}