package Day0508;

import java.util.Scanner;

public class Num2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		
		while (count <= N) {
			for (int i = 1; i <= count; i++)
				System.out.print("*");
			System.out.println();
			count++;
		}
		
	}
	
}
