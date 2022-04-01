package mod1;

public class CountCharacter {
	public static void main(String args[]) {
		String s1 = "Blessy";
		char[] chars = s1.toCharArray();

		// count the occurrence of a given character in String
		int charCount = 0;
		for (int i = 0; i < chars.length; i++) {
		if (chars[i] == 's') {
		charCount++;
		}
		}
		System.out.println("Testing count of character 's' on String:" + charCount);
		}
}


