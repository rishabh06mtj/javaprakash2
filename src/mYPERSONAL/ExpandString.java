package mYPERSONAL;
public class ExpandString 
{
public static void main(String[] args)
{
	String s="a3b2c4d1";
    
    for (int i = 0; i < s.length(); i++) 
    {
      
    if(Character.isAlphabetic(s.charAt(i)))
    {
        System.out.print(s.charAt(i));
    }
    else
    {
    int a = Character.getNumericValue(s.charAt(i));
      
    for (int j = 1; j <a; j++) 
    {
     System.out.print(s.charAt(i-1));    
    }
      
      }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
