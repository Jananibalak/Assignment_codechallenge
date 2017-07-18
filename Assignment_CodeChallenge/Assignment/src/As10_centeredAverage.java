import java.util.Scanner;


public class As10_centeredAverage {

	 int[] array;
	 int size;
	 
	 As10_centeredAverage(int[] array)
	 {
		 size=array.length;
		 this.array=array;
	 }
	 
	 public int centeredAverage()
	 {
	    if(size%2==0)
	    {
	    	return (array[size/2]+array[size/2+1])/2; 
	    }
	    else
	    	return array[size/2];
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
		 As10_centeredAverage a10=new As10_centeredAverage(array);
		 
			 System.out.print(a10.centeredAverage());
		 
		 in.close();
	 }
}
