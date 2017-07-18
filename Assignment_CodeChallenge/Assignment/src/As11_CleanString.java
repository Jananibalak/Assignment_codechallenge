import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class As11_CleanString {

	
    String string;
    As11_CleanString(String str)
	{
		string=str;
	}
	
	void cleanString()
	{
		Set<Character> s=new HashSet<Character>();
		for(int i=0;i<string.length();i++)
		 {
		
		if(!s.contains(string.charAt(i)))
		System.out.print(string.charAt(i));
		s.add(string.charAt(i));
		 }
	
		
		
	}
	public static void main(String args[])
	{
		String str;
		
		Scanner in=new Scanner(System.in);
		 str=in.nextLine();
		
		
		 As11_CleanString a11=new  As11_CleanString(str);
		a11.cleanString();
		in.close();
	}
}
