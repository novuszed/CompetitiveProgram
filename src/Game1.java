import java.util.*;
import java.lang.*;
public class Game1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++)
		{
			int cups=sc.nextInt();
			int commands=sc.nextInt();
			int key=sc.nextInt();
			int [] arr=new int[cups];
			arr[key]=1;
			//System.out.println(arr[key]);
			for(int k=0;k<commands;k++)
			{
				String temp=sc.next();
				//System.out.println(temp);

				if(temp.equals("SWAP"))
				{
					int ind1=sc.nextInt();
					int ind2=sc.nextInt();
					int temp1=arr[ind1];
					//System.out.println(temp1);
					arr[ind1]=arr[ind2];
					arr[ind2]=temp1;
				}
				else if(temp.equals("REVERSE"))
				{
					for(int z = 0; z < arr.length / 2; z++)
					{
					    int temp3 = arr[z];
					    arr[z] = arr[arr.length - z - 1];
					    arr[arr.length - z - 1] = temp3;
					}
				}
			}
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==1)
				{
					System.out.println(j);
					break;
				}
			}
			
			
		}
	}
}
