import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		String input1 = "text|text not";
		//String input = "\\Gtext|text not";
		String regex = "A([AB]+?)B";
		// String input = "[[a-d][m-p][x-z]]";
		Pattern p = Pattern.compile(regex);
		//String text = "abcdefghijklmnoprstuvwxyz";
		// String text = " text nottext";
		String text = "ABAABBABABABAB";
		Matcher m = p.matcher(text);
		
		while (m.find()) {
			String foundStr = text.substring(m.start(), m.end());
			System.out.printf("[%s], %d, %d, group: %s\n", 
					foundStr, m.start(), m.end(), m.group(0));
		}
		
		String regex2 = ".*end";
		String text2 = "hellohowru, end";
		Pattern p2 = Pattern.compile(regex2);
		m = p2.matcher(text2);
		
		while (m.find()) {
			String foundStr = text2.substring(m.start(), m.end());
			System.out.printf("[%s], %d, %d\n", foundStr, m.start(), m.end());
		}

	}

}
