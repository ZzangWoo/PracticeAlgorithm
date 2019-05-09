package Day0509;

import java.util.Scanner;

public class Num1065 {

static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		num = scan.nextInt();
		
		if(num > 1000)
			while(num > 1000)
				num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			func(i);
		}
		
		System.out.println(count);
	
	}
	
	public static void func(int n) {
		
		int[] arr = new int[3];
		int temp = n;
		
		if (n >= 1 && n < 100)
			count ++;
		else if (n >= 100 && n < 1000){
			for (int i = 0; i < arr.length; i++) {
				arr[i] = temp % 10;
				temp /= 10;
			}
			
			if (arr[2] - arr[1] == arr[1] - arr[0])
				count ++;
		} else {
			
		}
		
	}
	
}
