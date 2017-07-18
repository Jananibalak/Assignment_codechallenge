import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class As14_MapAB {
	
	Map<String,String> m;
	
	As14_MapAB(Map<String,String> m)
	{
		this.m=m;
	}
	
	void mapAB()
	{
		String key="";
		String value="";
		TreeMap<String,String> tm=new TreeMap<String,String>(m);
		for(Map.Entry<String,String> me:tm.entrySet())
		{
			key+=me.getKey();
			
			value+=me.getValue(); 
		}
		m.put(key, value);
	}
	
	public static void main(String args[])
	{
		Map<String,String> map=new HashMap<String,String>();
		Scanner in=new Scanner(System.in);
		String key,value;
		int size=in.nextInt();
		for(int i=0;i<size;i++)
		{
			key=in.next();
			value=in.next();
				
			map.put(key,value);
		}
		As14_MapAB a14=new As14_MapAB(map);
		a14.mapAB();
		System.out.println(a14.m);
		in.close();
		
		}

}
