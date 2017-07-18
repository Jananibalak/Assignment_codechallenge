import java.util.Scanner;


public class A4_ArrayCloseFar {
	
	 public static void main(String args[])
	 {
		 int[] aCloseFar;
		 int size;
		 Scanner in=new Scanner(System.in);
		 size=3;
		 aCloseFar=new int[size];
		 
		 for(int i=0;i<size;i++)
		 {
			 aCloseFar[i]=in.nextInt();
		 }
		 
		 if(aCloseFar[0]==aCloseFar[1]-1 || aCloseFar[0]==aCloseFar[1]+1 )
		 {
			 if(Math.abs(aCloseFar[2]-aCloseFar[1])>=2 && Math.abs(aCloseFar[2]-aCloseFar[0])>=2 )
			 {
				 System.out.print(true);
			 }
			 else
				 System.out.print(false);
		 }
		 else if(aCloseFar[0]==aCloseFar[2]-1 || aCloseFar[0]==aCloseFar[2]+1 )
		 {
			 if(Math.abs(aCloseFar[1]-aCloseFar[2])>=2 && Math.abs(aCloseFar[1]-aCloseFar[0])>=2 )
			 {
				 System.out.print(true);
			 }
			 else
				 System.out.print(false);
		 }
		 else
			 System.out.print(false);
			 
		 in.close();
	 }

}
