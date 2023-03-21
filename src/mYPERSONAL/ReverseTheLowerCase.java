package mYPERSONAL;

public class ReverseTheLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RaJeeV"; 
		 char ch[]=s.toCharArray();
       for(int i=ch.length-1;i>=0;i--)
       {
    	 if(ch[i]>='a'&&ch[i]<='z') 
    	 {
    		 ch[i]=(char)(ch[i]-32);
    		 System.out.print(ch[i]);
    		 
    	 }
    	 else if(ch[i]>='A'&&ch[i]<='Z') 
    	 {
    		 ch[i]=(char)(ch[i]+32);
    		// System.out.print(ch[i]);
    	 }
    	 
       }
     
	}

}
