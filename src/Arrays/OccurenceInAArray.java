package Arrays;
import java.util.LinkedHashSet;

public class OccurenceInAArray {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,1,2,4,3,7,3,8,7,5};
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{

			ls.add(ar[i]);

		}
		for (Integer integer  : ls) {

			int count=0;
			for (int i = 0; i < ar.length; i++) {
				if(integer==ar[i])
				{
					count++;
				}

			}

			System.out.println(integer+"-------->"+count);
		}
	}
}
