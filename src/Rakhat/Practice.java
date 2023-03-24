package Rakhat;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Hello yoll students");
		System.out.println("Nice to meet you!");
//test
		//test 2
		
//-----------------------------------------------------------		
//		Write a program that takes an array of integers and compares them
		//	int[] tempArray= {23, 44, 12, 99, 4};

		//	Then prints the smallest one out of them.
			
			int[] tempArray = {23, 44, 12, 99, 4};
	        int smallestNumber = tempArray[0]; 

	       
	        for (int i = 1; i < tempArray.length; i++) {
	            if (tempArray[i] < smallestNumber) {
	                smallestNumber = tempArray[i];
	            }
	        } 
	        System.out.println("The smallest number is: " + smallestNumber);
	    }
	      
			}
	


