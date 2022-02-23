import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex1 = "\\(I \\have a:? \\w+";
		String text = "I have a: boat, (I have a boat, I have a cola";
		
		Pattern p1 = Pattern.compile(regex1);
		Matcher m = p1.matcher(text);
		
		while (m.find()) {
			String foundStr = text.substring(m.start(), m.end());
			System.out.printf("[%s], %d, %d\n", foundStr, m.start(), m.end());
		}

	}

}
