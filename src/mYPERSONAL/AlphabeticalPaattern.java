package mYPERSONAL;
public class AlphabeticalPaattern {
	public static void main(String[] args) {
		String s="AABBBABC";//AABBBABC
		for(int i=0;i<=s.length();i++)
		{   
			for(int j=i;j<s.length()-1;j++)
			{
				for(int k=i;k<=j+1;k++)
				{
					//if(k==s.length())
					//	break;
					System.out.print(s.charAt(k));

				}

				System.out.println();

			}
		}
		//		for(int j=0;j<s.length()-1;j++)
		//		{
		//			
		//			for(int k=0;k<s.length()-1;k++)
		//			{
		//				if(k<s.length()-1)
		//					//break;
		//				System.out.println(s.substring(j,k+2+j));
		//				
		//		}
		//
		//			//System.out.println();
		//
		//		}


	}
}
