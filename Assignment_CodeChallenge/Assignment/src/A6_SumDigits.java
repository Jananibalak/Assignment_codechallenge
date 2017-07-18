import java.util.Scanner;


public class A6_SumDigits {
	String digitStr;
	
	A6_SumDigits(String str)
	{
		
		digitStr=str;
	}
	public int sumDigits()
	{
		 int sum=0;
         for(int i=0;i<digitStr.length();i++)
         {
        	 if(Character.isDigit(digitStr.charAt(i)))
        			 {
        		        sum+=Integer.parseInt(digitStr.charAt(i)+"");
        			 }
        	 
         }
         return sum;
	}
	
	public static void main(String args[])
	{
		String str;
		
		Scanner in=new Scanner(System.in);
		 str=in.nextLine();
		
		
		A6_SumDigits a6=new A6_SumDigits(str);
		System.out.print(a6.sumDigits());
		in.close();
	}

}
