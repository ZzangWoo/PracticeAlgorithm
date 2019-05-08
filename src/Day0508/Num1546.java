package Day0508;

import java.util.Scanner;

public class Num1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] arrPoint = new int [N];
		
		for (int i = 0; i < arrPoint.length; i++) {
			arrPoint[i] = scan.nextInt();
		}
		
		int maxPoint = 0;
		int temp = 0;
		
		maxPoint = arrPoint[0];
		
		for (int i = 0; i < arrPoint.length - 1; i++) {
			
			if (maxPoint > arrPoint[i+1])
				maxPoint = maxPoint;
			else
				maxPoint = arrPoint[i+1];
			
		}
		
		double total = 0;
		double[] arrPointFinal = new double[N];
		
		for (int i = 0; i < arrPoint.length; i++) {
			arrPointFinal[i] = (double) arrPoint[i] / maxPoint * 100;
			total += arrPointFinal[i];
		}
		
		System.out.printf("%.2f", total / N);
		
	}
	
}
