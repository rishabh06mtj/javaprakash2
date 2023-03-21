package mYPERSONAL;
public class NearestPelindrome {
	public static void main(String[] args) {
		int n =141;
		isPelindrome(n);
	}
	public static void isPelindrome(int x)
	{
		boolean bool=checkPelindrome(x);
		if(bool)
		{  
			int small=x-10;
			int big=x+10;
			System.out.println(small);
			System.out.println(big);
		}
		else
		{

			int temp=x%10;
			int small=x-temp+1;
			int big=x+(10-temp)+1;
            int diff1=x-small;
			int diff2=big-x;
			if(diff1>diff2)
				System.out.println(big);
			else if(diff1<diff2)
				System.out.println(small);
			else {
				System.out.println(small);
				System.out.println(big);
			}
		}
	}
	public static boolean checkPelindrome(int x)
	{  
		int num=x;	int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev =rev*10+d;
			num=num/10;
		}

		if(rev==x)
			return true;
		else
			return false;

	}
}
