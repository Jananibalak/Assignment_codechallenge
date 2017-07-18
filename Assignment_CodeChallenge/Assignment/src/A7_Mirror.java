import java.util.Scanner;


public class A7_Mirror {
	String mirror;
	
	A7_Mirror(String str)
	{
		mirror=str;
	}
	
	void mirrorEnds()
	{
		StringBuffer sb=new StringBuffer(mirror);
		String rString=new String(sb.reverse());
		for(int i=0;i<rString.length();i++)
		{
			if(mirror.charAt(i)==rString.charAt(i))
			{
				System.out.print(mirror.charAt(i));
			}
			else
				break;
		}
	}
	public static void main(String args[])
	{
		String str;
		
		Scanner in=new Scanner(System.in);
		 str=in.nextLine();
		
		
		A7_Mirror a7=new A7_Mirror(str);
		a7.mirrorEnds();
		in.close();
	}
	

}
