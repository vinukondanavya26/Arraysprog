package Array_programs;

import java.util.Scanner;

public class Demo26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements are:");
		int num=sc.nextInt();
		String[] x=new String[num];
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println("enter the elements present in @index is"+i);
			x[i]=sc.next();
		}
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println("enter the elements present in @index is" +i+ "is"+x[i]);
		}
		
	}

}
