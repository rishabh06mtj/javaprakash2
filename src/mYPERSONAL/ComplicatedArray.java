package mYPERSONAL;
public class ComplicatedArray 
{
	public static void main(String[] args)
	{  
		int s=0;
		int ar[]= {7,2,12,15,8,1,440,460};

		for (int i = 0; i < ar.length; i++)
		{
			s=sum(ar[i],ar[i+1]);
			i++;
		}
		System.out.println(s);
	}

	private static int sum(int i, int j) 
	{
		int sum =i+j;
		while(sum>9)
		{
			if(!(sum>0&&sum<10))
			{
				int d=sum%10;
				sum=sum+d;
				sum=sum/10;
			}
		}

		return sum;
	}
}
