 package mYPERSONAL;
public class RotateNumbers {

	public static void main(String[] args) {
		for(int i=1;i<6;i++)
		{
			int x=i;
			for(int j=1;j<6;j++)
			{
				System.out.print(x);
				x++;
				if(x>5)
					x=1;
			}
			System.out.println();
		}
		System.out.println("<-------------------------------->");
		System.out.println("<-------------------------------->");
		System.out.println("<-------------------------------->");
		
		for(int i=1;i<6;i++)
		{
			
			for(int j=i;j<6;j++)
			{
				
				System.out.print(j);
			if(j>=5)
			{
				for(int j1=1;j1<i;j1++)
			{
				
				System.out.print(j1);
			}
				}
					
			}
			System.out.println();
		}
	}






















	//	public static void main(String[] args) {
	//		String num="12345";
	//		String s1=" ";
	//		String[] s=new String[num.length()];
	//		for (int i = 0; i < s.length; i++) {
	//			if (num.charAt(i)!=' ') {
	//			s1=s1+num.charAt(i);
	//			}
	//			s[i]=s1;
	//			System.out.println(s[i]);
	//		}

}

