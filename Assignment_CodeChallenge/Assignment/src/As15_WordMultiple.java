import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class As15_WordMultiple {
    String [] array;
	
    As15_WordMultiple( String[] array)
	{
		this.array=array;
	}
	
	Map< String,Boolean>  wordMultiple()
	{
		Map< String,Boolean> hMap=new HashMap< String,Boolean>();
		
		for(int i=0;i<array.length;i++)
		{
			if(hMap.containsKey(array[i]))
			{
				hMap.put(array[i],true);
			}
			else
			{
				hMap.put(array[i],false);
			}
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
		As15_WordMultiple a15=new As15_WordMultiple(array);
		Map<String,Boolean> m=a15.wordMultiple();
		System.out.println(m);
		in.close();
		
		}


}
