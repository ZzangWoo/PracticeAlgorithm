package Day0509;

import java.util.Scanner;

public class Num1018 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] chess = {{"WBWBWBWB"}, {"BWBWBWBW"}, {"WBWBWBWB"}, {"BWBWBWBW"},
				{"WBWBWBWB"}, {"BWBWBWBW"}, {"WBWBWBWB"}, {"BWBWBWBW"}};
		
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				System.out.println(chess[i][j]);
			}
		}
		
	}
	
}
