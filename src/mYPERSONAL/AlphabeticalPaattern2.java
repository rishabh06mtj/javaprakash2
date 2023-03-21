package mYPERSONAL;
public class AlphabeticalPaattern2
{
public static void main(String[] args) 
{
	String s="Chennakeshwara reddy";
	 int y=0;
	for(int i=0;i<s.length();i++)
	{  
		for(int j=0;j<=i;j++)
		{
			if(y==s.length())
				break;
			System.out.print(s.charAt(y));
			y++;
		}
		
		System.out.println();
	}
//	String[] s1=s.split(" ");
//int x=0;
//int y=1;
//	for(int i=0;i<s1[0].length();i++)
//	{
//			if(y<s1[0].length()) {
//		System.out.println(s1[0].substring(x, y));
//		
//		x=y;
//		y=y+2+i;
//		}
//			else
//			{
//				System.out.println(s1[0].substring(x, s1[0].length()));
//				break;
//			}
//		
//		
//		
//		
//	}
}}

