package mYPERSONAL;
public class AscendingInAlphabeticalOrder
{
	public static void main(String[] args) 
	{
		String s="mya name is king queen myi";//o/p::is king my name queen
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) 
		{
			for (int j =i+1; j < s1.length; j++) 
			{
				String temp="";
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.print(s1[i]+" ");
		}
	
	}

}
