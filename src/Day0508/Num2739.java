package Day0508;

import java.util.Scanner;

public class Num2739 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		while (N < 1 || N > 9) {
			N = scan.nextInt();
		}
		
		for (int i = 1; i < 10; i++)
			System.out.println(N + " * " + i + " = " + N*i);
				
		
	}
	
}
