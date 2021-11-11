package modulo9.exemplos5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();	
		cal.set(2020, 1, 5, 13, 30, 0);
		
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -30);
		
		Date d = cal.getTime();
		
		System.out.println(d);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df1.format(d);
		System.out.println(f1);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String f2 = df2.format(d);
		System.out.println(f2);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String f3 = df3.format(d);
		System.out.println(f3);
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		String f4 = df4.format(d);
		System.out.println(f4);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String f5 = sdf1.format(d);
		System.out.println(f5);
		
		String sd1 = "2030-07-01";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d2 = sdf2.parse(sd1);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String sd2 = "01072030";
		SimpleDateFormat sdf3 = new SimpleDateFormat("ddMMyyyy");
		try {
			Date d3 = sdf3.parse(sd2);
			System.out.println(d3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
