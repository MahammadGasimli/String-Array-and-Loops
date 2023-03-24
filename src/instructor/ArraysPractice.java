package instructor;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an array of integers and compares them int[]
		 * tempArray= {23, 44, 12, 99, 4};
		 * 
		 * Then prints the smallest one out of them.
		 */

		int[] tempArray = { 23, 44, 12, 99, 4 };
		 int smallest = tempArray[0];
		 int biggest = smallest;
		 for (int temp : tempArray) {
		 if (temp > biggest) {
		 biggest = temp;
		 }
		 if (temp < smallest) {
		 smallest = temp;
		 }
		 }
		 System.out.println(biggest);
		 System.out.println(smallest);

	}

}
