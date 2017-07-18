import java.util.Scanner;


public class A9_More14 {
	 int[] array;
	 int size;
	 
	 A9_More14(int[] array)
	 {
		 size=array.length;
		 this.array=array;
	 }
	 
	 public boolean more14()
	 {
		int one=0;
		int four=0;
		for(int i=0;i<size;i++)
		{
			if(array[i]==4)
			{
				four++;
			}
			else if(array[i]==1)
				one++;
			
				
		}
		

		if(one>four)
		{
			return true;
		}
		else
			return false;
	 }
	 public static void main(String args[])
	 {
		 int[] array;
		 int size;
		 Scanner in=new Scanner(System.in);
		 size=in.nextInt();
		 array=new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array[i]=in.nextInt();
		 }
		 A9_More14 a9=new A9_More14(array);
		 
			 System.out.print(a9.more14());
		 
		 in.close();
	 }

}
