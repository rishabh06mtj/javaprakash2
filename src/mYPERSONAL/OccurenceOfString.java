package mYPERSONAL;
public class OccurenceOfString {
	public static void main(String[] args) {
		String s="RishabhRachitrohan";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		boolean rs[]=new boolean[ch.length];
		for(int i=0;i<rs.length;i++)
		{
			int count =0;
			if(rs[i]==false)
			{      count++;

			for(int j=i+1;j<rs.length;j++)
			{
				if(ch[i]==ch[j])
				{
					rs[j]=true;
					count++;
				}
			}
			System.out.print(ch[i]+""+count);
			}
//			if(count>1)
//			{
//				System.out.println("only duplicates-----"+ch[i]);
//			}
//			if(count<=1)
//			{
//				System.out.println("non duplicates-----"+ch[i]);
//			}


			}
			

		//}}}
		
//		System.out.println("============2nd one========================");
//		System.out.println("=====================================");
//		System.out.println("=====================================");
//		System.out.println("=====================================");
//		LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set1.add(s.charAt(i));
//		}
//		int duplicatesword=0;
//		for (Character string : set1) {
//			int count=0;
//			for (int i = 0; i < s.length(); i++) {
//				if(string.equals(s.charAt(i)))
//					count++;
//			}
//			if(count>1)
//			{
//				System.out.println(string+"-------------->"+count);
//				duplicatesword++;
//			}
//	}
//}}
    System.out.println("============2nd one========================");
	System.out.println("=====================================");
	System.out.println("=====================================");
	System.out.println("=====================================");
String s1="wwwweeeejjjjjdddd";
s1=s1.toLowerCase();
for(int a=0;a<s1.length();a++)
{
	int count1=1;
    char ch1=s1.charAt(a);
	for(int j=a+1;j<s1.length();j++)
	{
		if(ch1==s1.charAt(j))
		{
			count1++;
			a++;
		}
		else
		{ 
		break;
		}
			}
		System.out.println(ch+" "+count1);
}
}
	}	