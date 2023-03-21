package Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int ar[]= {56,58,1,98,23,48,55};
		for(int i=0;i<ar.length;i++)
		{     
			for(int j=i+1;j<ar.length;j++)
			{    int temp=0;  
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				}}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
