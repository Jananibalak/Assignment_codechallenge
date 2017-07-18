import java.util.Scanner;


public class As13_CanBalance {

	int[] array;
	 int size;
	 
	 As13_CanBalance (int[] array)
	 {
		 size=array.length;
		 this.array=array;
	 }
	 
	 public boolean canBalance()
	 {
		 int length=size-1;
		 int sum1,sum2;
		while(length>0)
		{
			sum1=0;
			sum2=0;
			for(int i=0;i<length;i++)
			{
				sum1+=array[i];
			}
			for(int i=length;i<size;i++)
			{
				sum2+=array[i];
			}
			if(sum1==sum2){
				return true;
			}
			length=length-1;
		}
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
		 As13_CanBalance a13=new As13_CanBalance(array);
		 
			 System.out.print(a13.canBalance());
		 
		 in.close();
	 }
}
