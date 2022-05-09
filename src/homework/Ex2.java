package src.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
	
	static void printTimestamps(String s) {
		Pattern p = Pattern.compile("\\d{2}:\\d{2}");
		Matcher m = p.matcher(s);
		while (m.find()) {			
			String match = m.group();			
			String[] parts = match.split(":");
			int hh = Integer.parseInt(parts[0]);
			int mm = Integer.parseInt(parts[1]);				
			boolean valid = 
					0 <= hh && hh <= 23 && 0 <= mm && mm <= 59; 
			
			System.out.printf("%s: %s\n", match, valid);
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printTimestamps("Отк22:33рой 0:00мн0:00е д0:60ве24:00рь и25:59 я войду\n"
				+ "И принесу с собою осень11:12\n"
				+ "И если ты21:30 меня попросишь -\n"
				+ "Т23:15ебе отдам ее19:100 я всю...00:60");

	}

}
