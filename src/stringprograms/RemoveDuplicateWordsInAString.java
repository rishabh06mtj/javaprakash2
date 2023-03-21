package stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInAString {
public static void main(String[] args) {
	String s="i am am from batch sdet44 batch a a batch";
	String[] s1=s.split(" ");
	String s2="";
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < s1.length; i++) {
		set.add(s1[i]);
	}
	
	for (String string : set) {
		
		s2=s2+" "+string;
		}
	System.out.println(s2);
	}
}
