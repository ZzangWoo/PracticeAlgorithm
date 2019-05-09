package Day0509;

import java.util.Scanner;

public class Num2902 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String outputStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				outputStr += str.charAt(i);
			} else if (str.charAt(i) == '-') {
				outputStr += str.charAt(i+1);
			}
		}
		
		System.out.println(outputStr);
		
	}
	
}
