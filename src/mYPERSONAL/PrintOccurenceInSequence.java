package mYPERSONAL;

public class PrintOccurenceInSequence {
public static void main(String[] args) {
	String s="wwwwwwffffuuuiiiop";
	for (int i = 0; i <s.length(); i++)
	{
		int count=1;
		char ch=s.charAt(i);
		for (int j =i+1; j <s.length(); j++)
		{
			if(ch==s.charAt(j))
			{
				count++;
				i++;
			}
			else
				break;
		}
		System.out.print(ch+""+count);
		}
}
}
