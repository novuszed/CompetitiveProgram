import java.util.*;


public class FizzSum {

	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
	
		while(sc.hasNextInt())
		{
			int sum=0;
			int begin=sc.nextInt();
			int end=sc.nextInt();
			for(int i=begin;i<=end;i++)
			{
				if(i%3==0 && i%5==0)
				{
					sum+=i*i;
				}
				else if(i%3==0)
				{
					sum+=i+3;
				}
				else if(i%5==0)
				{
					sum+=i+5;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
