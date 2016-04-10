import java.util.*;
public class Subtractions {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++)
		{
			long a= sc.nextLong();
			long b= sc.nextLong();
			int count=0;
			int temp=0;
			while(a!=0 && b!=0)
			{
				if(a>b)
				{
					temp=(int)(a/b);
					count+=(a/b);
					a-=temp*b;
				}
				else
				{
					temp=(int)(b/a);
					count+=(b/a);
					b-=temp*a;			
					}
			}
			System.out.println(count);
			//System.out.println(gcdcount(a,b,0));
			//System.out.println(gcd(a,b));
		}
	}
	/*
	public static long gcd(long a, long b)
	{
		if(b==0 && a==0)
		{
			return a;
		}
		System.out.println(a+" "+b);
		return gcd(b,a%b);
	}*/
	/*
	public static int gcdcount(long a, long b,int count)
	{
		if(a==0 || b==0)
		{
			return count;
		}
		long max = (a>b)?a:b;
		long smaller = (a<b)?a:b;
		return gcdcount(max-smaller,smaller,count+1);
	}
	*/
}
