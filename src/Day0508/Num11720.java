package Day0508;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str = scan.next();
		
		while (N != str.length()) {
			str = scan.next();
		}
		
		String[] arrStr = str.split("");
		
		int sum = 0;
		
		for (int i = 0; i < arrStr.length; i++) {
			sum += Integer.parseInt(arrStr[i]);
		}
		
		System.out.println(sum);
			
	}
	
}
