package collectioNCONCEPT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("King Kohli");
		hs.add(10);
		hs.add(null);
		hs.add(20);
		hs.add(null);
		hs.add(10);
		hs.add("subho");
		System.out.println(hs);
		System.out.println("<---------------------->");
		System.out.println(hs.isEmpty());
		System.out.println("<---------------------->");
		System.out.println(hs.remove(10));
		System.out.println(hs);
		System.out.println("<---------------------->");
		System.out.println(hs.contains(10));
		System.out.println("<---------------------->");
		System.out.println(hs.size());
		System.out.println("<---------------------->");
		for(Object object:hs)
		{
			System.out.println(object);
			
		}
		System.out.println("<---------------------->");

		Iterator<Object>it=hs.iterator();
		while(it.hasNext())
		{
System.out.println(it.next());
		}
		System.out.println("<------ArrayList---------->");

		ArrayList al=new ArrayList<>(hs);
		System.out.println(al);
		System.out.println("<---------------------->");
		System.out.println("<---------------------->");
		System.out.println("<---------------------->");
		System.out.println("<----LinkedHashSet-------->");

		LinkedHashSet ls=new LinkedHashSet();
		ls.add(10);
		ls.add(20);
		ls.add("Virat");
		ls.add(null);
		ls.add(87);
		ls.add(78);
		ls.add(10);
		System.out.println(ls);
		System.out.println("<---------------------->");
		System.out.println("<---------------------->");
		System.out.println("<---------------------->");
		System.out.println("<-----TreeSet--------->");
		
		TreeSet ts=new TreeSet();
		ts.add(98);
		ts.add(95);
		ts.add(75);
		ts.add(101);
		ts.add(7);
		System.out.println(ts);
		System.out.println("<---------------------->");
		System.out.println(ts.contains(95));
		System.out.println("<---------------------->");
		System.out.println(ts.size());
		System.out.println("<---------------------->");
		System.out.println(ts.first());
		System.out.println("<---------------------->");
		System.out.println(ts.last());
		System.out.println("<---------------------->");
		System.out.println(ts.descendingSet());
		System.out.println("<---------------------->");
		Iterator it1=ts.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("<---------------------->");
		Iterator it2=ts.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}

		
		
		
		
		
	}
}
