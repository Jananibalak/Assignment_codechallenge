import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class As16_Pairs {
String [] array;
	
    As16_Pairs( String[] array)
	{
		this.array=array;
	}
	
	Map< Character,Character> pairs()
	{
		Map< Character,Character> hMap=new HashMap< Character,Character>();
		
		for(int i=0;i<array.length;i++)
		{
			
				hMap.put(array[i].charAt(0),array[i].charAt(array[i].length()-1));
			
		}
		return hMap;
	
	}
	
	public static void main(String args[])
	{
				Scanner in=new Scanner(System.in);
		String [] array;
		 int size;
		 //Scanner in=new Scanner(System.in);
		 size=in.nextInt();
		 array=new  String[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array[i]=in.next();
		 }
		As16_Pairs a16=new As16_Pairs(array);
		System.out.println(a16.pairs());
		in.close();
		
		}
}
