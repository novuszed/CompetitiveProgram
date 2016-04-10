import java.util.*;
public class TanyaToys {
static 	int [] toBuy = new int[100005];
static int arr[] = new int[100005];

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int have = sc.nextInt();
		int money = sc.nextInt();
		for(int i=1;i<=have;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,1,have+1);
	
		int count = 0;
		//ArrayList<Integer> toBuy = new ArrayList<Integer>();
		int [] toBuy = new int[100005];
		int temp = money;
		int a=1;
		int b =1;
		while(money>0)
		{
			if(arr[b]==a)
			{
				b++;
			}
			else
			{
				if(money>=a)
				{
					
					toBuy[++count]=a;
					money-=a;
				}
				else
				{
					break;
				}
			}
			a++;
		}
		
		System.out.println(count);
		for(int i=1;i<=count;i++)
		{
			System.out.print(toBuy[i]+" ");
		}

	}
}
