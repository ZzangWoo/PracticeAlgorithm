package Day0508;

import java.util.Scanner;

public class Num11721 {

	public static void main(String[] args) {
		
		/******************** 실패코드 *************************
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		while (str.length() == 0 || str.length() > 100) {
			str = scan.next();
		}
		
		int start = 0, end = 0;
				
		for (int i = 0; i < str.length(); i++) {
			
			if (i % 10 == 0) {
				start = i;
			} else if (i % 10 == 9) {
				end = i;
			}
			
			if (end - start == 9) {
				System.out.println(str.substring(start, end+1));
			}
			
		}
		
		System.out.println(str.substring(start, str.length()));
		*****************************************************/
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		while (str.length() == 0 || str.length() > 100) {
			str = scan.next();
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (i % 10 == 9)
				System.out.println();
		}
	}
	
}
