package mod1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbersFromString {
	public static void main(String[] args)
	{
		//Using ReplaceAll
		
		String s1 = "Blessy%$1234";
		String str = s1.replaceAll("[^0-9]", "");
		System.out.println("Find integer using replaceAll :: " + str);
		
		// Using regrex
		String s2 = "Blessy%$3456";
		Pattern p = Pattern.compile("\\d+");
		Matcher matcher = p.matcher(s2);
		if(matcher.find()) {
		System.out.println("Find integer Using Regrex :: " + matcher.group());
		}
		
		String s3 = "Raj%$5678";
		Pattern p1 = Pattern.compile("[a-zA-Z]+");
		Matcher matcher1 = p1.matcher(s3);
		if(matcher1.find()) {
		System.out.println("Find string using Regrex :: " + matcher1.group());
		}
	}


}
