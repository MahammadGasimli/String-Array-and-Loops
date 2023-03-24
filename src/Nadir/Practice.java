package Nadir;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Hello yoll students");
		System.out.println("Nice to meet you");
		System.out.println("Hello Instructor, nice to meet you, too!");
		System.out.println("Have a good day!");
		
		
		String apps[][] = { 
				 { "Facebook", "Instagram", "Twitter", "Youtube" }, 
			                        { "Bank of America", "TD Bank", "Chase", "Wells Fargo" }, 
			                        { "Hotels", "AirBnb", "Expedia" }
				 };
			
			for (int i = 0; i < apps.length; i++) {
				for (int j=0; j < apps[i].length; j++) {
			
			System.out.println(apps[i][j]);
			}
			}
			
//			for (String[] appsRow : apps) {
//				for (String app : appsRow)
//					System.out.println(app);		
//			}
	}

}
