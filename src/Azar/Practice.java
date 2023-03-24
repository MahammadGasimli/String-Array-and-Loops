package Azar;

public class Practice {

	public static void main(String[] args) {
		/*
		 * Print all the values of below array in using nested for loops nested for each
		 * loop String apps[][] = { { "Facebook", "Instagram", "Twitter", "Youtube" }, {
		 * "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, { "Hotels", "AirBnb",
		 * "Expedia" }
		 */
		// nested
		String apps[][] = { { "Facebook", "Instagram", "Twitter", "Youtube" },
				{ "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, { "Hotels", "AirBnb", "Expedia" } };
		for (int i = 0; i < apps.length; i++) {
			for (int j = 0; j < apps[i].length; j++) {
				System.out.println(apps[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------------------------------------------");

		// for each
		for (String[] app : apps) {
			for (String ap : app) {
				System.out.println(ap);
			}
		}
	}

}
