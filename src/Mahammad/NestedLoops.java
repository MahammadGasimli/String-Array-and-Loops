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
		
//		Print all the values of below array in using 
//		nested for loops
//		nested for each loop

		
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
		
		int [] tempArray = {23, 44, 12, 99, 4};
		
		Arrays.sort(tempArray);
		
		System.out.println(tempArray[0]);
		for(int i = 0; i<tempArray.length; i++) {
			if(i == 0) {
			System.out.println(tempArray[i]);
			}
			
		}
		
		
		
		
		
		
	}

}
