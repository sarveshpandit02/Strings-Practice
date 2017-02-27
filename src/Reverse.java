import java.util.*;
public class Reverse {
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char ch[]=new char[s.length()];
	ch=s.toCharArray();
	char temp;
	for(int i=0;i<ch.length/2;i++)
	{
	  temp=ch[i];
	  ch[i]=ch[s.length()-i-1];
	  ch[s.length()-i-1]=temp;
	}
	System.out.println(ch);
  }
}
