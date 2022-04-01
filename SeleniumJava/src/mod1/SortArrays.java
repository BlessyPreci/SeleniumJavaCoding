package mod1;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int a[] = {1,4,7,3,2,7,5}; 
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)   
		{    
			System.out.print(a[i] + " ");
		}
	}
}
