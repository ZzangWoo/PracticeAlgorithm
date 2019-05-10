package Day0509;

import java.util.Scanner;

public class Num1018 {

	static int countRawW = 0;
	static int countRawB = 0;
	static int countColumnW = 0;
	static int countColumnB = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int m = scan.nextInt(); int n = scan.nextInt();
		char[][] inputChess = new char[m][n];
		
		for (int i = 0; i < m; i++) {
			String input = scan.next();
			for (int j = 0; j < n; j++) {
				inputChess[i][j] = input.charAt(j);
			}
		}
		
		int row = 0, column = 0;
		
		int min = 99999, temp = 0, temp1 = 0, temp2 = 0;
		
		while (row != (m-7) && column != (n-7)) {
			
			temp1 = 0;
			temp2 = 0;
			
			for (int i = row; i < row + 8; i++) {
				for (int j = column; j < column + 8; j++) {
					temp1 += compareChessW(inputChess[i][j]);
					temp2 += compareChessB(inputChess[i][j]);
				}
			}
			
			if (temp1 > temp2) {
				temp = temp2;
			} else if (temp1 < temp2){
				temp = temp1;
			} else {
				temp = temp1;
			}
			
			if (column == (n - 8)) {
				row ++;
				column = 0;
			} else {
				column ++;
			}
			
			if (min > temp) {
				min = temp;
			}
			
			countRawW = 0;
			countRawB = 0;
			countColumnW = 0;
			countColumnB = 0;
						
		}
		
		System.out.println(min);
		
	}
	
	public static int compareChessW (char compareChar) {
		
		char[][] chessW = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};
		
		int result = 0;
		
		if (chessW[countRawW][countColumnW] != compareChar) {
			result = 1;
		} else {				
			result = 0;
		}
			
		countColumnW ++;
			
		if (countColumnW == 8) {
			countRawW ++;
			countColumnW = 0;
		}
				
		return result;
		
	}
	
	public static int compareChessB (char compareChar) {
		
		char[][] chessB = {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};
		
		int result = 0;
		
		if (chessB[countRawB][countColumnB] != compareChar) {
			result = 1;
		} else {				
			result = 0;
		}
			
		countColumnB ++;
			
		if (countColumnB == 8) {
			countRawB ++;
			countColumnB = 0;
		}
		
		return result;
		
	}
	
}
