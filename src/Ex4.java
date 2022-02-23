import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Какая-то сине-зеленовая трава мопс-дядяпос";		
		String replaced = s.replaceAll("(\\p{L}+)-(\\p{L}+)", "$2-$1");
		
		System.out.println(s);
		System.out.println(replaced);
		
	}

}
