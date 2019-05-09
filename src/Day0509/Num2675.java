package Day0509;

import java.util.Scanner;

public class Num2675 {

	public static void main(String[] args) {
		
		/*************** 다른 답안 *******************
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int count = 0;
		
		int R;
		String S;
		
		while (count != T) {
		
			String str = "";
			R = scan.nextInt();	S = scan.next();
	
			for (int i = 0; i < S.length(); i++) {
				for (int j = 0; j < R; j++) {
					str += S.charAt(i);
				}
			}
			System.out.println(str);
			count ++;
			
		}
		*******************************************/
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			int R = scan.nextInt();
			String S = scan.next();
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
			
		}
		
	}
	
}
