package Array_programs;

public class Sum1 {
	public static void main(String[] args) {
		int[] x= {10,20,30};
		int sum=0;
		for(int i=0;i<=x.length-1;i++)
		{
			sum=sum+x[i];
		}
		
		System.out.println(sum);
		System.out.println((sum/x.length));
		}
	}

