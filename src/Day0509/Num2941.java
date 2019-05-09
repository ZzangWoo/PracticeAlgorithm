package Day0509;

import java.util.Scanner;

public class Num2941 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] change = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String input = scan.next();
		
		for (int i = 0; i < 8; i++) {
			input = input.replace(change[i], "*");
		}
		
		System.out.println(input.length());
		
	}
	
}
