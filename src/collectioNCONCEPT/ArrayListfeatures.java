package collectioNCONCEPT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ArrayListfeatures {
	
public static void main(String[] args){
	
	/*Object[] ob=new Object[3];
	ob[0]="basava";
	ob[1]=null;
	ob[2]=10;
	System.out.println(ob[0]);
	System.out.println(ob[1]);
	System.out.println(ob[2]);*/
	
	ArrayList al=new ArrayList<>();
	
	al.add("Kohli");
	al.add('V');
	al.add("got");
	al.add(166);
	al.add(null);
	System.out.println(al);
	System.out.println("<--------------------------->");
	
	
	ArrayList al1=new ArrayList<>();
	
	al1.add("Shubham");
	al1.add('g');
	al1.add("got");
	al1.add(109);
	al1.add(null);
	System.out.println(al1);
	System.out.println("<--------------------------->");
	
ArrayList<Integer> al2=new ArrayList<>();
	
	al2.add(10);
	al2.add(40);
	al2.add(70);
	al2.add(96);
	al2.add(20);
	System.out.println(al2);
	Collections.sort(al2);
	System.out.println(al2);
	System.out.println("<----------------------------->");
	
	
	al2.addAll(al1);
	System.out.println(al2);
	System.out.println("<----------------------------->");
	
	boolean check = al2.contains("got");
	System.out.println(check);
	
	System.out.println(al2.indexOf(20));//fetch the index
	System.out.println(al2.get(6));//fetch the element
	System.out.println(al2.remove(2));//remove the element in the <>index
	System.out.println("<----------------------------->");
	System.out.println("<----------------------------->");
	
	Stack s=new Stack<>();
	s.push(20);
	s.push(40);
	s.push(80);
	s.push(60);
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());


}
}
