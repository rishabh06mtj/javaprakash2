package collectioNCONCEPT;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MAp {
public static void main(String[] args) {
	Hashtable<Integer,String> ht=new Hashtable<>();
	ht.put(20,"heelo");
	ht.put(10,"heloo 1");
	ht.put(8,"heelo 2");
	ht.put(9,"heelo 3");
	ht.put(3,"heelo 4");
	System.out.println(ht);
	//ht.put(null,"heelo");//null key not allowed
	System.out.println(ht);
	System.out.println("<------------------------------->");
	System.out.println(ht.remove(10));
	System.out.println("<------------------------------->");
	System.out.println(ht.contains("heloo 1"));
	System.out.println("<------------------------------->");
	System.out.println(ht.containsKey(10));
	System.out.println("<------------------------------->");
	System.out.println(ht.get(9));
	System.out.println("<------------------------------->");
	for(Entry<Integer, String> h:ht.entrySet())
	{
		System.out.println(h.getKey()+"--------"+h.getValue());
	}
	System.out.println("<------------------------------->");
	System.out.println("  ");
	System.out.println("  ");
	System.out.println("<--------------HashMap------------------>");
	
HashMap<Integer,String> hm=new HashMap<>();
hm.put(20,"heelo");
hm.put(10,"heloo 1");
hm.put(8,"heelo 2");
hm.put(9,"heelo 3");
hm.put(3,"heelo 4");
hm.put(null,"heelo");//null key one allowed
	System.out.println(hm);
	System.out.println("<------------------------------->");
	System.out.println(hm.remove(10));
	System.out.println("<------------------------------->");
	System.out.println(hm.containsValue("heloo 1"));
	System.out.println("<------------------------------->");
	System.out.println(hm.containsKey(10));
	System.out.println("<------------------------------->");
	System.out.println(hm.get(9));
	System.out.println("<------------------------------->");
	for(Entry<Integer, String> h:hm.entrySet())
	{
		System.out.println(h.getKey()+"--------"+h.getValue());
	}
	System.out.println("<------------------------------->");
	System.out.println("  ");
	System.out.println("  ");
	System.out.println("<--------------TreeMap------------------->");
	
	
	TreeMap<Integer,String> tm=new TreeMap<>();
	tm.put(20,"heelo");
	tm.put(10,"heloo 1");
	tm.put(8,"heelo 2");
	tm.put(9,"heelo 3");
	tm.put(3,"heelo 4");
	//tm.put(null,"heelo");//null key not allowed
	tm.put(7,null);
	tm.put(11,null);
		System.out.println(tm);
		System.out.println("<------------------------------->");
		System.out.println(tm.remove(10));
		System.out.println("<------------------------------->");
		System.out.println(tm.containsValue("heloo 1"));
		System.out.println("<------------------------------->");
		System.out.println(tm.containsKey(10));
		System.out.println("<------------------------------->");
		System.out.println(tm.get(9));
		System.out.println("<------------------------------->");
		for(Entry<Integer, String> h:tm.entrySet())
		{
			System.out.println(h.getKey()+"--------"+h.getValue());
		}


}
}
