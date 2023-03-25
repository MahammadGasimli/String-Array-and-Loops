package Mahammad;
import java.util.Arrays;
import java.util.Scanner;

public class CodeBoard {

	public static void main(String[] args) {
		

		
//------------------------Task 1-----------------------------------		
//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        
//        System.out.println(word1 + word2 + word2 + word1);
		

		
		
		
		
		
		

//------------------------Task 2---------------------------------
		
//			Scanner scan = new Scanner(System.in);
//			String word = scan.next();
//	        
//		if(word.length()>1 && word.length() % 2 != 0) {
//			
//			word = word.substring(word.length()/2, word.length()/2 + 1);
//			System.out.println(word);
//			
//		}else if(word.length() == 1) {
//			
//			for(int i = 0; i<=2; i++ ) {
//				System.out.print(word);
//				
//			}
//			
//		}else if(word.length()>2 && word.length() % 2 == 0) {
//
//			word = word.substring(word.length()/2 -1, word.length()/2 + 1);
//			System.out.println(word);
//			
//		}else if(word.length() == 2) {
//			
//			for(int i = 0; i<2; i++)
//				System.out.print(word);
//		}
//		
		
		
		
		
		
		
//-------------------------Task 3------------------------------		
		
		
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        
//        if (word.length() >= 5 && word.length() %2 != 0) {
//        	word = word.substring(word.length()/2 -1, word.length()/2 + 2);
//        	System.out.println(word);
//        }else {
//        	System.out.println("invalid");
//        }
		

		
		
		
		
		
		
		
		
//-----------------------Task 4-------------------------	
		
		
//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.next();
//        String word2 = scan.next();
//        
//        String a[] = word1.split("");
//        
//        String b[] = word2.split("");
//        
//        if (word1.length() == 3 && word2.length() == 3) {
//        	//0    12
//        	//  01    2
//        	//a-lo-ok-l
//        	System.out.println(a[0] + b[0] + a[1] + b[1] + a[2] + b[2]);
//        }else {
//        	System.out.println("cannot merge");
//        }
 
	
		
		
		
		
		
//--------------------Task 5----------------------------
		
		
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//		
//		if(word.length() == 5) {
//			
//			String word1[] = word.split("");
//			for(int i = word.length()-1; i >= 0; i--)
//				System.out.print(word1[i]);
//			
//		}else if (word.length() < 5) {
//			System.out.println("Too short!");
//		}else if(word.length() > 5) {
//			System.out.println("Too long!");
//		}
//		
	
		
		
		

		
//------------------------Task 6-----------------------------
		
		
//	    Scanner scan = new Scanner(System.in);
//	    String start = scan.next();
//	    String end = scan.next();
//
//	    String [] direction = { "right", "down", "left"};
//	    
//	    if(start.equals("A") && end.equals("D")) {
////	    	System.out.println(direction[0]+ " > " + direction[1] + " > " + direction[2] + ": D found" );
//	    
//	    	for(int i = 0; i<direction.length; i++) {
//	    		
//	    		if(i<direction.length - 1) {
//	    		
//	    			System.out.print(direction[i] + " > " );
//	    		
//	    		}else if(i == direction.length - 1) {
//	    			
//	    			System.out.print(direction[i] + ": D found");
//	    		
//	    		}
//	    	}
//	    	
//	    }else if(start.equals("A") && end.equals("C")) {
//	    	
//	    	for(int i = 0; i<direction.length - 1; i++) {
//	    		
//	    		if(i<direction.length - 2) {
//	    		
//	    			System.out.print(direction[i] + " > " );
//	    		
//	    		}else if(i == direction.length - 2) {
//	    			
//	    			System.out.print(direction[i] + ": C found");
//	    			
//	    		}
//	    	}
//	    	
//	    }else if(start.equals("A") && end.equals("B")) {
//	    	
//	    	for(int i = 0; i<direction.length - 2; i++) {
//	    		
//	    		if(i<direction.length - 2) {
//	    		
//	    			System.out.print(direction[i] + ": B found" );
//	    				    			
//	    		}
//	    	}
//	    	
//	    }else if(start.equals("B") && end.equals("C")) {
//	    	
//	    	for(int i = 1; i<direction.length - 1; i++) {
//	    		
//	    		if(i < direction.length - 1) {
//	    		
//	    			System.out.print(direction[i] + ": C found" );
//	    				    			
//	    		}
//	    	}
//	    	
//	    }else if(start.equals("B") && end.equals("D")) {
//	    	
//	    	for(int i = 1; i<direction.length; i++) {
//	    		
//	    		if(i<direction.length - 1) {
//	    		
//	    			System.out.print(direction[i] + " > " );
//	    		
//	    		}else if(i == direction.length - 1) {
//	    			
//	    			System.out.print(direction[i] + ": D found");
//	    		
//	    		}
//	    	}
//	    	
//	    }else if(start.equals("C") && end.equals("D")) {
//	    	
//	    	for(int i = 2; i<direction.length; i++) {
//	    		
//	    		if(i < direction.length) {
//	    		
//	    			System.out.print(direction[i] + ": D found" );
//	    				    			
//	    		}
//	    	}
//	    	
//	    }else if(start.equals(end)) {
//	    	System.out.println(start);
//	    }
	    
	  

		
//----------------------- task 7 --------------------------		
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int end = inp.nextInt();
	    if(end > 0) {	
	    	for (int i = 1; i <= end; i++) {
	    		if(i < end) {
	    			System.out.print(i + " ");
	    		}else if(i == end) {
	    			System.out.println(i);
	    		}
	    	}
	    }else {
	    	System.out.println("(no output)");
	    }
		
		
	}

}
