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
			insert[i] = new int[col + 1];
			insert[i][0] = col;
			for (int j = 1; j < insert[i].length; j++) {
				insert[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < C; i++) {
			
			float avg = 0;
			float total = 0;
			int count = 0;
			
			for (int j = 1; j < insert[i].length; j++) {
				total += insert[i][j];
			}
			avg = total / insert[i][0];
			for (int k = 1; k < insert[i].length; k++) {
				if (insert[i][k] > avg)
					count ++;
			}
			System.out.println(String.format("%.3f", (float) count / (float) insert[i][0] * 100) + "%");
		
		}
		
	}
	
}
