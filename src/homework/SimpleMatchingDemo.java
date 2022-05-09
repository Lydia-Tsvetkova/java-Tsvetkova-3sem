package src.homework;

import java.util.regex.Pattern;

public class SimpleMatchingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[\\d]\\Z";
		System.out.println(Pattern.matches("[\\d]", "51"));

	}

}
