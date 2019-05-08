package Day0508;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Num11719 {

	public static void main(String[] args) {
		
		/************** 런타임 에러 **************************
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int i = 0;
		
		
		while (i <= 100) {
			String str = scan.nextLine();
			arr.add(str);
			i++;
			if (str.equals("exit"))
				break;
		}
		
		Iterator<String> iterator = arr.iterator();
		while (iterator.hasNext()) {
			String str2 = iterator.next();
			System.out.println(str2);
		}
		*************************************************/
		
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
		
	}
	
}
