package mYPERSONAL;
public class PossiblePelindome {
	public static void main(String[] args) 
	{
		String s="malayalam";
		s=s.toLowerCase();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			for (int  j=i+2; j <=s.length(); j++) {
				String pelindrome=s.substring(i,j);
                System.out.println(pelindrome);
				boolean bool1=checkPelindrome(pelindrome);
				if(bool1)
					count++;
			}
		}
		System.out.println(count);
	}
	public static boolean checkPelindrome(String word)
	{
		word=word.toLowerCase();
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		if(word.equals(rev))
			return true;
		else
			return false;


	}
}
