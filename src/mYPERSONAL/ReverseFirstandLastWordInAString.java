package mYPERSONAL;

public class ReverseFirstandLastWordInAString {

public static void main(String[] args) {
	String s="Anil";
	char ch[]=s.toCharArray();
	char temp=ch[0];
	 ch[0]=ch[ch.length-1];
	 ch[ch.length-1]=temp;
	 System.out.println(ch);
	
}
	
	
	
	
}
