package mYPERSONAL;
public class StringArray 
{
	public static void main(String[] args) 
	{
		String s[]= {"hello","hii","am","i"};//op=hii am
		for (int i = 0; i < s.length; i++) 
		{
			if(i==0||i==s.length-1)
			{
				s[i]="";

			}
		}
		for (int i = 0; i< s.length; i++)
		{
			System.out.println(s[i]);
		}

	}
}
