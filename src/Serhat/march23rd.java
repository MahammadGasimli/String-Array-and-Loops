package Serhat;

public class march23rd {

	public static void main(String[] args) {
		int[] tempArray = { 23,-50, 44, 12, 99, 4,150 };
		int min = tempArray[0];

		for (int i = 1; i < tempArray.length; i++) {
			if (tempArray[i] > min) {
				min = tempArray[i];

			}
		}
		System.out.println(min);

	}

}
