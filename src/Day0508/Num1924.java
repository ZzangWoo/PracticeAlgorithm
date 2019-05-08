package Day0508;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Num1924 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		String startDate = "2017-1-1";
		String endDate = "2017-" + x + "-" + y;
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			
			Date beginDateFinal = formatter.parse(startDate);
			Date endDateFinal = formatter.parse(endDate);
			
			long diff = endDateFinal.getTime() - beginDateFinal.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			
			int afterDays = (int) diffDays % 7;
			
			System.out.println(day[afterDays]);
		
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
