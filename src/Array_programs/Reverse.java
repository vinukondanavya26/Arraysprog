package Array_programs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements are");
		int num=sc.nextInt();
		int[] x=new int[num];
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println("enter the elements are:"+i);
			x[i]=sc.nextInt();
			
		}
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
			
		}
				
	
	}

}
