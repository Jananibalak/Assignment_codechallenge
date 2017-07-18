import java.util.Scanner;


public class A5_ArrRound {
	
	int[] array;
	int size=3;
	A5_ArrRound(int[] array)
	{
		
		this.array=array;
	}
	public int roundSum()
	{
         int sum=0;
		 for(int i=0;i<3;i++)
		 {
			 sum+=round10(array[i]);
		 }
		 return sum;
	}
	public int round10(int num)
	{
		//System.out.println(num+"n10 "+num/10);
		int r=(num/10)*10;
		if(num%10>=5)
		{
			r=r+10;
		}
		//System.out.println(r);
		return r;
	}
	
	public static void main(String args[])
	{
		int array[];
		array=new int[3];
		
		Scanner in=new Scanner(System.in);
		 for(int i=0;i<3;i++)
		 {
			 array[i]=in.nextInt();
		 }

		
		
		A5_ArrRound a5=new A5_ArrRound(array);
		System.out.print(a5.roundSum());
		in.close();
	}

}
