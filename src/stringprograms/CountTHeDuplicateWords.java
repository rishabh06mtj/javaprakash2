package stringprograms;

import java.util.LinkedHashSet;

public class CountTHeDuplicateWords {
	public static void main(String[] args) {
		String s="i am am from batch sdet44 batch a a batch";
		String[] s1=s.split(" ");
		String s2="";
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		
		int duplicateword=0;
		for (String string : set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(string.equals(s1[i]))
					count++;
				}
			if(count>1)
			{
				duplicateword++;
				System.out.println(string+" ");
				
			}
			}
		System.out.println(duplicateword);
}}
