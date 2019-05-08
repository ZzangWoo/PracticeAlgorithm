package Day0508;

import java.util.Scanner;

public class Num1476 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int e = scan.nextInt();
		int s = scan.nextInt();
		int m = scan.nextInt();
		
		while ((e < 1 || e > 15) || (s < 1 || s > 28) || (m < 1 || m > 19)) {
			e = scan.nextInt();
			s = scan.nextInt();
			m = scan.nextInt();
		}
		
		int countYear = 1;
		
		int pre_e = 1;
		int pre_s = 1;
		int pre_m = 1;
		
		while (true) {
			
			if (pre_e == e && pre_s == s && pre_m == m) {
				System.out.println(countYear);
				break;
			}
			
			pre_e ++;
			pre_s ++;
			pre_m ++;
			
			if (pre_e > 15) {
				pre_e = 1;
			}
			if (pre_s > 28) {
				pre_s = 1;
			}
			if (pre_m > 19) {
				pre_m = 1;
			}
			
			countYear ++;
		
		}
	}
	
}
