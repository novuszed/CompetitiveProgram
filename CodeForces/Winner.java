import java.util.*;
public class Winner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] arr = new String[cases];
		int[] num = new int[cases];
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<cases;i++)
		{
			
			String name = sc.next();
			arr[i]=name;
			int score = sc.nextInt();
			if (!hm.containsKey(name))
			{
				hm.put(name,score);
			}
			else
			{
				hm.put(name, hm.get(name)+score);
			}
			num[i]=hm.get(name);
			
		}
		int max = 0;
		for(Integer value: hm.values())
		{
			if (max<value)
			{
				max=value;
			}
		}
		for (int k=0;k<arr.length;k++)
		{
			if(hm.get(arr[k])==max && num[k]>=max)
			{
				System.out.println(arr[k]);
				break;
			}
		}
		/*
		for(String name: hm.keySet())
		{
			if(hm.get(name)==max)
			{
				System.out.println(name);
				break;
			}
		}
		*/
	}
}
