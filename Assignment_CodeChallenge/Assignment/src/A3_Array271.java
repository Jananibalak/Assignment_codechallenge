import java.util.Scanner;


public class A3_Array271 {
	 public static void main(String args[])
	 {
		 int[] array271;
		 int size;
		 Scanner in=new Scanner(System.in);
		 size=in.nextInt();
		 array271=new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array271[i]=in.nextInt();
		 }
		 int flag=0;
		 for(int i=0;i<size;i++)
		 {
			if(array271[i]==2)
				
			{
				if(array271[i+1]==7)
					
				{
					if(array271[i+2]==1)
						
					{
						flag=1;
						break;
					}
				}
				
				
			}
		 }
		 if(flag==1)
			 System.out.print(true);
		 else
			 System.out.print(false);
		 in.close();
	 }
}
