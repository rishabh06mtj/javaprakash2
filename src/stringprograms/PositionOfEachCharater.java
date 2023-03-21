package stringprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PositionOfEachCharater {
public static void main(String[] args) {
	String s="Tester";
	s=s.toLowerCase();
//	for (int i = 0; i < s.length(); i++) {
//		System.out.println(s.charAt(i)+"------->"+(i+1));
//		
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			
			ls.add(s.charAt(i));
			
		}
		for (Character character : ls) {
			
			
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i))
				{
					System.out.println(character+"----->"+(i+1));
				}
				
	}
}
}}
