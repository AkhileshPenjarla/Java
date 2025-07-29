package day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_expression1 {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("javacoding");
		Matcher matcher=pattern.matcher("javacoding is very easy");
		if(matcher.find()) {
			System.out.println("match is found");
		}
	}

}
