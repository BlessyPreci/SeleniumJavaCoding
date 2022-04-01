package mod1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	public static void main(String args[]) {
		String s1 = "blessy";
		char[] chars = s1.toCharArray();
		Set<Character> showDuplicate = new HashSet<Character>();
		Set<Character> removeDuplicate = new HashSet<Character>();

		// show duplicate
		for (int i = 0; i < chars.length; i++) {
		//add() method - The function adds the element only if the specified element is not already present in the set
		if (!showDuplicate.add(chars[i])) {
		System.out.println("duplicate characters :: " + chars[i]);
		}
		}
		// remove duplicates
		for (int i = 0; i < chars.length; i++) {
		if (removeDuplicate.add(chars[i])) {
		System.out.println("Unique characters :: " + chars[i]);
		}
		}

		}

}
