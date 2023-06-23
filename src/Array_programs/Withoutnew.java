package Array_programs;

public class Withoutnew {
	public static void main(String[] args) {
		int[]x= {10,20,30,40};
		int highest=x[0];
		int lowest=x[0];
		for(int i:x)
		{
			if(i>highest)
			{
				highest=i;
			}
			if(i<lowest)
			{
				lowest=i;
			}
		}
		
			System.out.println(highest);
			System.out.println(lowest);
		}
			
		}


