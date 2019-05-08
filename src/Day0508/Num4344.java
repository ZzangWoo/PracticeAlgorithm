package Day0508;

import java.util.Scanner;

public class Num4344 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		int col;
		
		int[][] insert = new int[C][];
		
		for (int i = 0; i < C; i++) {
			col = scan.nextInt();
			insert[i] = new int[col];
			insert[i][0] = col;
			for (int j = 1; j < insert[i].length; j++) {
				insert[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < insert[i].length; j++) {
				System.out.print(insert[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
