package mYPERSONAL;

public class FirstCharacterupper {
public static void main(String[] args) {
	String s="fuck u jealous people";
 char[] ch=s.toCharArray();
 boolean flag=true;
	for (int i = 0; i < ch.length; i++)
	{
		if(ch[i]!=' ')
		{
		if(flag)
		{
			ch[i]=Character.toUpperCase(ch[i]);
			flag=false;
		}
		}
		else
		{
			flag=true;
		}
	}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]+" ");
	}
}
}
