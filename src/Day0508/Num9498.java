package Day0508;

import java.util.Scanner;

public class Num9498 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); int point = scan.nextInt();
		
		if (point >= 90 && point <= 100)
			System.out.println("A");
		else if (point >= 80 && point <= 89)
			System.out.println("B");
		else if (point >= 70 && point <= 79)
			System.out.println("C");
		else if (point >= 60 && point <= 69)
			System.out.println("D");
		else
			System.out.println("F");
		
	}
	
}
