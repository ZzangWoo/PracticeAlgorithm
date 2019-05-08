package Day0508;

import java.util.Scanner;

public class Num10950 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int count = 1;
		
		while (count <= T) {
			int A = scan.nextInt(); int B = scan.nextInt();
			System.out.println(A+B);
			count++;
		}
		
	}
	
}
