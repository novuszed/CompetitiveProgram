import java.util.*;
public class Population {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int z=0;z<cases;z++)
		{
			long states = sc.nextLong();
			long changes = sc.nextLong();
			//ArrayList<Long> arr1 = new ArrayList<Long>();
			HashMap<Long,Long >arr2 = new HashMap<Long,Long>();
			//int[] arr = new int[states];
			long count=1;
			for(int i=0;i<states;i++)
			{
				arr2.put(count++, sc.nextLong());
				//arr[i]=sc.nextInt();
				
			}
			for(int k=0;k<changes;k++)
			{
				long location = sc.nextLong();
				long chg = sc.nextLong();
				arr2.put(location, arr2.get(location) + chg);
				//arr[location-1] = arr[location-1] + chg;
			}
			//for(int j=0;j<arr.length;j++)
			//{
			for(long i=1;i<=arr2.size();i++)
			{
				if(i==arr2.size())
				{
					System.out.print(arr2.get(i));
				}
				else
				{
					System.out.print(arr2.get(i)+" ");

				}
			}
			System.out.println();
				//}
		}
	}
}
