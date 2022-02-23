import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "прикотл кот-ркот Котлета КЛот КрОТ !?КОт му Кот коттт. кот, сказал, кот!!!";
		
		Pattern p = Pattern.compile("\\bкот\\b", Pattern.UNICODE_CASE 
					| Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(s);
				
		int count = 0;
		while (matcher.find()) {
			System.out.printf("%d, %d: ", matcher.start(), matcher.end());
			System.out.println(s.substring(matcher.start(), 
					matcher.end()));
			++count;
		}
		
		System.out.println(count);
		
		
		p = Pattern.compile("[\\^\\s\\p{Punct}]кот[$\\s\\p{Punct}&&[^-]]", 
				Pattern.UNICODE_CASE
				| Pattern.CASE_INSENSITIVE);
		matcher = p.matcher(s);
				
		count = 0;
		while (matcher.find()) {
			System.out.printf("%d, %d: ", matcher.start(), matcher.end());
			System.out.println(s.substring(matcher.start(), 
					matcher.end()));
			++count;

		}
		
		System.out.println(count);
		
		
	}

}
