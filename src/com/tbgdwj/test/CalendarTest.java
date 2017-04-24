package com.tbgdwj.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String str1 ="2013/03/23";
		String str2 ="2013-3-13";
		
		DateFormat df1 = new SimpleDateFormat("yyyy/mm/dd");
		//DateFormat df1 = new SimpleDateFormat("yyyy-mm-dd");
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);

		
		Date date = new Date();
		String str_date = df2.format(date);
		//String str_date = df1.format(date);
		System.out.println(str_date);
		
		Date date1 = df1.parse(str1);
		//Date date2 = df1.parse(str2);
		 
		System.out.println(date1);
		//System.out.println(date2);
	}

}
