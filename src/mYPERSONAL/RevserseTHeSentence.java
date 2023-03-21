package mYPERSONAL;

public class RevserseTHeSentence {
	//TYPE=1
	public static void main(String[] args) {
		String s="BAsava is topper of the class";
		String []s2=s.split(" ");
		String str="";
		for(int i=0;i<s2.length;i++)
		{
			str=str+s2[i];
		}
		for(int i=str.length()-1;i>0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
//	public static void main(String[] args) {
//		String s="BAsava is topper of the class";
//		String []s2=s.split(" ");
//		for(int i=s2.length-1;i>=0;i--)
//		{
//			System.out.print(s2[i]+" ");
//		}
//		
//		
//	}
//	//TYPE=2
////	public static void main(String[] args) {
//		
//		String s="BAsava is topper of the class";
//		String s1="";
//		String []s2=s.split(" ");
//		
//		for(int i=0;i<s2.length;i++)
//		{
//			s1=s2[i]+" "+s1;
//		}
//		System.out.println(s1);
//	}
	
	//TYPE-3
	/*public static void main(String[] args){
		
		String s="Basava is topper of the class";
		s=s+" ";
		String rev="",word="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				word =word+ch;
			}
			else
			{
				
				rev=word+" "+rev;
				word="";
			}
			
			
		}
		System.out.println(rev);
		}*/
	
	//complete reverse even the word
//	public static void main(String[] args){
//		String s="King Kohli";
//		StringBuilder sb=new StringBuilder(s);
//		StringBuilder s1=sb.reverse();
//		System.out.println(s1);
//	
//}

}
