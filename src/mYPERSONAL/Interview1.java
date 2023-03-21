package mYPERSONAL;
public class Interview1 
{
	public static void main(String[] args) 
	{
		String s="aabcbbdeaa"; //Print aa ab bc bb bd de ea aa
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i; j <=i+1; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}

		System.out.println(" ");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");

		String s1="Selenium";//O/p :s se sel sele selen seleni seleniu selenium
		for (int i = 0; i <s1.length()-1; i++) {
			for (int j =0; j <=i; j++) {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		String s2="aabbaa"; //O/p : aa ab bb ba aa
		for (int i = 0; i <s2.length()-1; i++) {
			for (int j =i; j <=i+1; j++) {
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	
		System.out.println(" ");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");

		String it="aabbcdef";
		char ch[]=it.toCharArray();
		boolean rs[]=new boolean[ch.length];
		for(int i=0;i<rs.length;i++)
		{

			if(rs[i]==false)
			{      
				int count =1;

				for(int j=i+1;j<rs.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						rs[j]=true;
						count++;
					}
				}
				if(count==1)
				{
					System.out.print(ch[i]);
					break;
				}

			}
		}
		System.out.println(" ");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");

		int a[] ={1,2,5};
		for (int i = 1; i <=10; i++) 
		{

			boolean print =numPrint(i,a);
			if(print==true)
			{
				System.out.println(i);
			}
		}
	}

	public static boolean numPrint(int i,int ar[])
	{
		for (int j = 0; j < ar.length; j++) 
		{
			if (i==ar[j])
			{

				return false;
			}
		}
		return true;
	}

}
