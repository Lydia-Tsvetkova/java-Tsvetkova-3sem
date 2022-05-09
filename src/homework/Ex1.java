package src.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
	
	static Pattern[] patterns = {
			Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,4}"),
			Pattern.compile("[[a-z][\\-][_][0-9]]+" 
			              + "@"
			              + "[[a-z][\\-][_][0-9]]+"
			              + "\\.[a-z]{2,4}"),
			Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
					+ "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:"
					+ "[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23"
					+ "-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")"
					+ "@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)"
					+ "+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|"
					+ "\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
					+ "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|"
					+ "[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-"
					+ "\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-"
					+ "\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	};

	static boolean validateEmail(String s, int regEx) {	
		Matcher m = patterns[regEx - 1].matcher(s);
		return m.matches();		
	}
	
	
	
	static void testValidateEmail1(String s) {		
		System.out.printf("[%20s]: ", s);
		for (int i = 1; i <= 3; ++i)
			System.out.printf("%10s", validateEmail(s, i));
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		
		String[] emails = {				
				"@m.xu",				
				"a@m.xu", 
				"A@m.xu",
				"Ab@m.xu",
				"ab@mA.xy",
				"ab@ma.x",
				"ab@ma.xy",
				
				"ab1@ma.xy",
				"a.b2@ma.xy",
				"a3b2@ma.xy",
				"a-3b_2@ma.xy",
				"1a3b2@ma.xy",
				"ab@-ma1.xy",
				"ab@ma.xy5",
		};
		
		
		for (String s : emails) {
			testValidateEmail1(s);
		}
		
		

	}

}
