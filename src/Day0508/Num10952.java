package Day0508;

import java.util.Scanner;

public class Num10952 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String str = scan.nextLine();
			String[] arrStr = str.split(" ");
			
			int a = Integer.parseInt(arrStr[0]);
			int b = Integer.parseInt(arrStr[1]);
			
			if (a == 0 && b == 0)
				break;
			
			System.out.println(a+b);
		}
		
	}
	
}
