import java.util.Scanner;


public class A1_Array667 {
	
	int[] array667;
	 int size;
	 
	 A1_Array667(int[] array)
	 {
		 size=array.length;
		 array667=array;
	 }
	 
	 public int array667()
	 {
		 int count=0;
		 for(int i=1;i<size;i++)
		 {
			if(array667[i]==6&&array667[i-1]==6||array667[i]==7&&array667[i-1]==6)
				
			{
				count++;
			}
		 }
		 return count;
	 }

	 public static void main(String args[])
	 {
		 int[] array667;
		 int size;
		 Scanner in=new Scanner(System.in);
		 size=in.nextInt();
		 array667=new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array667[i]=in.nextInt();
		 }
		 A1_Array667 a1=new A1_Array667(array667);
		 System.out.print(a1.array667());
		 in.close();
	 }
}
