package mYPERSONAL;

public class Iteration {

	public static void main(String[] args){
		Y y = new Y();
		System.out.println(y.i);    //L5
	}
}
class X {
	static int i = 1111;

	static{
		i = i-- - --i;    //L1 
	}

	{
		i = i++ + ++i;    //L2 
	}
}

class Y extends X{
	static{
		i = --i - i--;    //L3
	}
	{
		i = ++i + i++;    //L4
	}
}
