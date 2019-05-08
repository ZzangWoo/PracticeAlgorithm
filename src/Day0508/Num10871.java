package Day0508;

import java.util.Scanner;

public class Num10871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); int X = scan.nextInt();
		
		while (N < 1 || N > 10000) {
			N = scan.nextInt();
		}
		
		String str = scan.nextLine();
		String[] arrStr = str.split(" ");
		
		while (N != arrStr.length) {
			str = scan.nextLine();
			arrStr = str.split(" ");
		}
		
		for (int i = 0; i < arrStr.length; i++) {
			if (Integer.parseInt(arrStr[i]) < X) {
				System.out.print(arrStr[i] + " ");
			}
		}
		
	}
	
}
