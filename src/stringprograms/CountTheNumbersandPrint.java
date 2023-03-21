package stringprograms;

public class CountTheNumbersandPrint {
	public static void main(String[] args) {
		String s="aabccddf";
		boolean[] bl=new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) 
		{
			if(bl[i]==false)
			{       
				int count=1;
				for (int j =1; j < s.length()-1; j++) 
				{    
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
						bl[j]=true;
					}
				}
				if(count>1)
					System.out.print(s.charAt(i)+""+count);
				else
					System.out.print(s.charAt(i)+""+count);
			}
		}    

		//               
		//           LinkedHashSet<Character>ls=new LinkedHashSet<Character>();
		//
		//       		for (int i = 0; i < s.length(); i++) 
		//       		{
		//       			ls.add(s.charAt(i));
		//       		}
		//
		//       		for (Character ch : ls) 
		//       		{   int count=0;
		//       		for (int j = 0; j < s.length(); j++) 
		//       		{
		//                 if (ch==s.charAt(j)) 
		//       			{
		//
		//       				count++;
		//       			}
		//       		}
		//
		//       		if(count>1)
		//       			System.out.print(ch+""+count);
		//
		//       		else
		//       			System.out.print(ch+""+count);
		//       		}
	}
}
