import java.util.Scanner;


public class A2_ArrayTriples {

	 int[] aTriples;
	 int size;
	 A2_ArrayTriples (int[] array)
	 {
		 size=array.length;
		 aTriples=array;
	 }
	 boolean noTriples()
	 {
		 int count=1;
		 for(int i=1;i<size;i++)
		 {
			if(aTriples[i]==aTriples[i-1])
				
			{
				count++;
				if(count==3)
				{
					
				
					break;
				}
			}
			else
			{
				count=1;
			}
		 }
		 if(count==3)
		     return false;
		 else
			 return true;
	 }
	 public static void main(String args[])
	 {
		 int[] aTriples;
		 int size;
		 Scanner in=new Scanner(System.in);
		 size=in.nextInt();
		 aTriples=new int[size];
		 
		 for(int i=0;i<size;i++)
		 {
			 aTriples[i]=in.nextInt();
		 }
		 A2_ArrayTriples a2=new A2_ArrayTriples(aTriples);
		 System.out.print(a2.noTriples());
		 
		 in.close();
	 }

}
