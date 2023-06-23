package Array_programs;

public class Repeat {
	public static void main(String[] args) {
		int[] x= {10,20,30,20,50,20};
		int num=20;
		int count=0;
		for(int i=0;i<=x.length-1;i++)
		{
			if(num==x[i])
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(num + "is present" + count + "times");
		}
		else
		{
			System.out.println(num+"is not present");
		}
	}

}
