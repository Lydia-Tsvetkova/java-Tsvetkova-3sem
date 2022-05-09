package src.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "0 - первое натуральное число. У меня 2 яблока и -4 банана, 205 человек из 16 местных";
		
		Pattern p = Pattern.compile("[-]?\\d+");
		Matcher m = p.matcher(text);
		
		StringBuffer result = new StringBuffer();
		while (m.find()) {
			System.out.println(m.group());
			int i = Integer.parseInt(m.group());
			m.appendReplacement(result, Integer.toString(i - 1));			
		}
		m.appendTail(result);
		
		System.out.printf("[%s]\n", result);
		
	}

}
