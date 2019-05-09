package Day0509;

import java.util.Scanner;

public class Num10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] output = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1};
		
		String str = scan.next();
		
		int count = 0;
		
		while (count != str.length()) {
			for (int i = 0; i < alpha.length; i++) {
				if (output[i] == -1) {
					if (str.charAt(count) == alpha[i]) {
						output[i] = count;
					}				
				}			
			}
			count ++;
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		
	}
	
}
