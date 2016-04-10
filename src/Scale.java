import java.util.*;
public class Scale {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();

		for(int i=0;i<testcase;i++)
		{
			

			int souls=sc.nextInt();
			long []arr =new long[souls];

			for(int k=0;k<souls;k++)
			{
				arr[k]=sc.nextLong();
			}
		
		Arrays.sort(arr);
	
		int count =0;
		long sum=0;
		for(int z=1;z<arr.length-1;z++)
		{
			/*
			if(sum>arr[z])
			{
				System.out.println(count);
				break;
			}
			*/
			
			//System.out.println("z: "+arr[z]);
			/*
			if(sum>arr[z+1])
			{
				break;
			}
			*/
			//System.out.println("sum: "+sum);
			if((arr[z]-arr[z-1])>arr[z])
			{
				break;
			}
			count++;
		}
		System.out.println(count+1);

		}
	}
}
