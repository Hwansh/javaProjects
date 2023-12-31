package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-08-29T10:40:30Z"));
		
		System.out.println(date1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 5);
//		d = cal.getTime();
//		System.out.println(date1.format(d));		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: "+minutes);
		System.out.println("Month: "+month);

	}
}
