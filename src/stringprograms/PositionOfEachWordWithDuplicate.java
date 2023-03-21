package stringprograms;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithDuplicate {
	public static void main(String[] args) {
		String s="i am am from batch sdet44 batch a a batch";
		String[] s1=s.split(" ");
		//		for (int i = 0; i < s1.length; i++) {
		//			System.out.println(s1[i]+"-------------->"+(i+1));
		//
		//		}
		System.out.println("------------------");

		System.out.println("------------------");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}

		for (String string : set) 
		{
			for(int i = 0; i < s1.length; i++) 
			{
				if(string.equals(s1[i]))
				{
					System.out.println(string+"-------------->"+(i+1));

				}
			}
		}
	}}
