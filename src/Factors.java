import java.util.*;
public class Factors {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int z=0;z<cases;z++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a==b)
			{
				System.out.println(0);
				continue;
			}
			if(b>a)
			{
				long temp=a;
				a=b;
				b=temp;
			}
			long count=0;
			for(long i=b+1;i<=a;i++)
			{
				//System.out.println("i: "+i);
				//System.out.println(primeFactors(i));
				count+=primeFactors(i);
			}
			System.out.println(count);
			
			
		}
		sc.close();
	}
	public static long primeFactors(long n)
	{
		long count=1;
		while(n%2==0)
		{
			n=n/2;
			count+=n/2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				n=n/i;
				count++;
			}
		}
		return count;
	}
}
