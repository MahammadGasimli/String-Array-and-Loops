package Mahammad;

import java.util.Arrays;

public class NestedLoops {

	public static void main(String[] args) {
		
		String [][] states = {
				{"Virginia", "New York", "California"},
				{"Texas", "Kansas"}
				};
		
		for(String[] state : states) {
			
			for(String eachStates : state) {
				System.out.println(eachStates);
			}
		}
		
////		Print all the values of below array in using 
////		nested for loops
////		nested for each loop

		
		String apps[][] = { 
				 { "Facebook", "Instagram", "Twitter", "Youtube" }, 
			     { "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, 
			     { "Hotels", "AirBnb", "Expedia" }
				 };
		
//---------------for each loop-------------------
		
		for (String[] app : apps) {
			System.out.println("");

			for(String eachApp : app) {
				System.out.println(eachApp);
			}
		}
		
//------------- for loop------------------------		
		int a = 0;
		for (a = 0; a<apps.length; a++) {
			System.out.println("");
			for(int j = 0; j<apps[a].length; j++) {
				System.out.println(apps[a][j]);
			}
		}
		System.out.println("");
//-------------------- min/max number in Array ----------------- 		
		int [] tempArray = {23, 44, 0, 12, 99, 4, 124};
		
		int max = tempArray[0];
		int min = tempArray[0];
		for(int i = 1; i<tempArray.length; i++) {
			if(min > tempArray[i]) {
				min = tempArray[i];
			}
			if(max < tempArray[i]) {
				max = tempArray[i];
			}
		}
		System.out.println("The minimum number in the Array is " + min);
		System.out.println("The maximum number in the Array is " + max);
		
		
		
		
	}

}
