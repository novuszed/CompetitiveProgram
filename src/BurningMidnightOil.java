import java.util.*;
public class BurningMidnightOil {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int answer=sc.nextInt();
		int incre=sc.nextInt();
		int counter=0;
		/*
		for(long i=answer;i>=1;i--)
		{
			
		}*/
		//System.out.println(59/2);
		int min=1;
		int max=answer;
		while(min<=max)
		{
			int mid=(min+max)/2;
			//System.out.println(mid);
			counter=mid;
			int val=cal(mid,incre);
			//System.out.println(val);
			if(val>answer)
			{
				max=mid-1;
			}
			else if(val<answer)
			{
				min=mid+1;
			}
			else
			{
				break;
			}
		}
		if(cal(counter,incre)>=answer)
		{	
		System.out.println(counter);
		}
		else
		{
			System.out.println(counter+1);
		}
	}
	public static int cal(int x, int v)
	{
		int sum=x;
		int temp=x;
		while(temp>1)
		{
			//System.out.println(temp);
			temp=temp/v;
			sum+=temp;
			//temp=temp/v;
		}
		return sum;
	}
}
