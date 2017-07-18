import java.util.Arrays;
import java.util.Scanner;


public class A8_ZeroFront {
	 int[] arrayZF;
	 int size;
	 
	 A8_ZeroFront(int[] array)
	 {
		 size=array.length;
		 this.arrayZF=array;
	 }
	 
	 public void zeroFront()
	 {
		 Arrays.sort(arrayZF);
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
		 A8_ZeroFront a8=new A8_ZeroFront(array);
		 a8.zeroFront();
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(a8.arrayZF[i]);
		 }
		 in.close();
	 }
}
