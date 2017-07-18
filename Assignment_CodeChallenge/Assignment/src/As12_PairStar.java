
import java.util.Scanner;



public class As12_PairStar {

	 String string;
	 As12_PairStar(String str)
		{
			string=str;
		}
		
		void pairStar()
		{
			System.out.print(string.charAt(0));
		
			for(int i=1;i<string.length();i++)
			 {
				if(string.charAt(i)==string.charAt(i-1))
				{
					System.out.print("*"+string.charAt(i));
				}
				else
				System.out.print(string.charAt(i));
			 }
			
		}
		public static void main(String args[])
		{
			String str;
			
			Scanner in=new Scanner(System.in);
			 str=in.nextLine();
			
			 As12_PairStar a12=new  As12_PairStar(str);
			 a12.pairStar();
			
			in.close();
		}
	
}
