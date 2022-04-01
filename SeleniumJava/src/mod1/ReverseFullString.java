package mod1;

public class ReverseFullString {
	String s1 = "Welcome to Chennai";
	String arr[] = s1.split(" "); // splitting String s1 with a pattern splitting the string
	String result = " ";
	{
	// Loop through all words
	for (int i = 0; i < arr.length; i++) { // Iterate over the arr array and store the string in reverse order.
		if (i == arr.length - 1) {
			result = arr[i] + result;
			// System.out.println(result);
		} else {
			result = " " + arr[i] + result;
			// System.out.println(result);
		}
	}
	System.out.println(result);
}
}

