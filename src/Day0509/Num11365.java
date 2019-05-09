package Day0509;

import java.util.Scanner;

public class Num11365 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			String str = scan.nextLine();
			
			if (str.equals("END"))
				break;
			
			System.out.println(reverseString(str));
				
		}
		
	}

	private static String reverseString(String str) {
		return (new StringBuffer(str).reverse().toString());
	}
	
}
