package mYPERSONAL;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Printnumbersametime
{
	public static void main(String[] args) 
	{
		int num=123;
		String s=String.valueOf(num);
		for (int k = 0; k <s.length(); k++) 
		{
			for (int j = 0; j <s.length(); j++) 
			{
				for (int i =0; i<k+1; i++)
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.print(" ");
		}
		
	}
}