package mYPERSONAL;
public class ReversetheSentence {
	public static void main(String[] args) {	
		String s="welcome to tyss";
		s=s+" ";
		String word="";
		String s1="";
		int j1=0;
		String ar[]=new String[3];
		for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);
			if(ch!=' ')
			{
				word =word+ch;
			
			}
			else
			{
				
				System.out.println(word.length());
				ar[j1]=word;
				j1++;
				word=" ";
			}

		}
		//		for (int i = 0; i < ar.length; i++) {
		//			System.out.println(ar[i]);
		//		}
		//		for(int i=0;i<ar.length;i++)
		//		{   
		//			String s2=ar[i];
		//			s1=s1+" "+s2;
		//			String s3="";
		//		for(int j=i+1;j<ar.length;j++)
		//		{
		//			s3=s3+" "+ar[j];
		//		}
		//		System.out.println(s3+" "+s1);
		//		}
		int a=0;
		int b=1;
		int c=2;
		int temp=0;


		for(int i=0;i<ar.length;i++)
		{
			temp=a;
			a=b;
			b=c;
			c=temp;
			System.out.println(ar[a]+" "+ar[b]+" "+ar[c]);

		}
	}
}
