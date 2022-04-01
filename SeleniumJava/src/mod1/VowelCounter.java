package mod1;

public class VowelCounter {
	public static void main(String args[]) {
		String s1 = "Blessy";
		char[] chars = s1.toCharArray();
		int count=0;
		for(int i=0;i<chars.length;i++) {

		if(chars[i]=='a'|| chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u')
		{
		count++;
		}

		}
		System.out.println(count);
		}
}
