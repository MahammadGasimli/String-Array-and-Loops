package Mahammad;

import java.util.Arrays;

public class NestedLoops {

	public static void main(String[] args) {
		
//		String [][] states = {
//				{"Virginia", "New York", "California"},
//				{"Texas", "Kansas"}
//				};
//		
//		for(String[] state : states) {
//			
//			for(String eachStates : state) {
//				System.out.println(eachStates);
//			}
//		}
		
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
		int i = 0;
		for (i = 0; i<apps.length; i++) {
			System.out.println("");
			for(int j = 0; j<apps[i].length; j++) {
				System.out.println(apps[i][j]);
			}
		}
		
		
		
		
	}

}
