package Azar;

public class practice2 {

	public static void main(String[] args) {

		running();
		jogging();
		jumping();

	}

	public static void running() {
		System.out.println("I'm running");
	}
 
	public static void jogging() {
		System.out.println("I'm jogging");
		running();
	}

	public static void jumping() {
		System.out.println("I'm jumping");

	}
}
