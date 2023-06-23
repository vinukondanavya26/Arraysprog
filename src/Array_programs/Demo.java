package Array_programs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the elements are");
		int num=scan.nextInt();
		int[] x=new int[num];
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println("the elements present in @index:"+i);
			x[i]=scan.nextInt();
		}
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println("the elements present in @index :"+i+ "is " +x[i]);
		}
	}

}
