import java.util.*;
public class Compress {
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
	  ArrayList<Character>al=new ArrayList<Character>();
	  for(int i=0;i<s.length();i++)
	  {
	   if(!hm.containsKey(s.charAt(i)))
	   {
		hm.put(s.charAt(i),1);
		al.add(s.charAt(i));
	   }
	   else
		 hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
	  }
	  
	 for(int i=0;i<al.size();i++)
	 {
	  System.out.print(al.get(i));
	  System.out.print(hm.get(al.get(i)));
	 }
	  
	  
	}

}
