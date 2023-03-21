package mYPERSONAL;
import java.util.LinkedHashSet;

public class RemoveDuplicateAndPrintInReverseOrder
{
public static void main(String[] args) 
{
	String s="BANGALORE";
	String s1="";
	LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
	for (int i = 0; i <s.length(); i++)
	{
			ls.add(s.charAt(i));
	}
	for (Character c : ls)
	{
	s1=c+s1;
	}
	System.out.println(s1);
	}

}
