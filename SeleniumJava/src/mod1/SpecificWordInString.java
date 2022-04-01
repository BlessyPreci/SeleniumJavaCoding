package mod1;

public class SpecificWordInString {
public static void main(String[] args)
	
	{
		String s1 = "Today is Friday";
		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].contains(s2[2]))
			{
			System.out.println("print :: " + s2[i]);
			}
		}
	}
}
