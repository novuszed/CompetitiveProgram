import java.util.*;
public class HardProcess {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int zero = sc.nextInt();
		int arr[] = new int[num];
		int sum=0;
		int beg=0;
		int end=0;
		int max=0;
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<num;i++)
		{
			int temp=zero;
			int index=i;
			sum=0;
			while(temp!=0 && index<num-1)
			{
				if(arr[index]==0)
				{
					temp--;
					sum++;
				}else
				{
					sum++;
				}
				index++;
			}
			if(arr[index]==1)
			{
				sum++;
			}
			else
			{
				if(temp!=0)
				{
					sum++;
					temp--;
					
				}
			}
			if(sum>max)
			{
				max=sum;
				end=index-1;
				beg=i;
				//System.out.println("Max: "+max+" start: "+beg+" End: "+end);

			}
			
		}
		if(zero==0)
		{
			
		}
		else{
		for(int i=beg;i<=end;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
		}
		}
		System.out.println(max);
		for(Integer i: arr)
		{
			System.out.print(i+" ");
		}
	}
}
