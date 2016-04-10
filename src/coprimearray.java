import java.util.*;
public class coprimearray {
	//static int arr[] = new int[10000000];
	static int ans[] = new int[10000000];
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int temp;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int track=0;
		//System.out.println(gcd(345,670));
		for(int i=0;i<num;i++)
		{
			//arr[i]=sc.nextInt();
			arr.add(sc.nextInt());
		}
		for(int i=0;i<num-1;i++)
		{
			//System.out.println("Comparing: "+arr.get(count)+" "+arr.get(count+1));
			//if(gcd(arr[i],arr[i+1])==1)
			if(gcd(arr.get(count),arr.get(count+1))==1)
			{
				//ans[count]=arr[i];
				count++;
				continue;
			}
			else
			{
				//ans[count]=arr[i];
				//count++;
				track++;
				temp = arr.get(count)+1;
				//while(gcd(temp,arr.get(count+1))!=1)
				//{
					//temp++;
				//}
				//count++;
				//ans[count++]=temp;
				arr.add(count+1, 1);
				count++;
				i--;
			}
		}
		//ans[count]=arr[num-1];
		System.out.println(track);
		for(Integer i: arr)
		{
			System.out.print(i+" ");
		}
		/*
		for(int i=0;i<=count;i++)
		{
			System.out.print(ans[i]+" ");
		}
		*/
		
	}
	public static int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
}
