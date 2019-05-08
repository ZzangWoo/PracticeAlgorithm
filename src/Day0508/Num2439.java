package Day0508;

import java.util.Scanner;

public class Num2439 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		
		while (count <= N) {
			for (int i = 1; i <= N - count; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
		
	}
	
}
