package stringprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class OccurenceOfCharacter {
public static void main(String[] args) {
	String s="Tester";
	s=s.toLowerCase();
	LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		
		ls.add(s.charAt(i));
		
	}
	for (Character character : ls) {
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(character==s.charAt(i))
			{
				count++;
			}
			
		}
		
		System.out.println(character+"-------->"+count);
	}
	
	
}
}
