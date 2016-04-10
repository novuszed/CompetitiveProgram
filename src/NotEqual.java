import java.util.*;
public class NotEqual {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int quer=sc.nextInt();
		int[] a=new int[ele];
		//LinkedList place=new LinkedList();
		HashMap<Integer, List<Integer>> map=new HashMap<Integer,List<Integer>>();
		for(int z=0;z<ele;z++)
		{
			a[z]=sc.nextInt();
		}
		for(int i=0;i<ele;i++)
		{
			int temp=a[i];
			if(!map.containsKey(temp))
			{		
				//LinkedList<Integer> place=new LinkedList<Integer>();

				map.put(temp,new LinkedList<Integer>());
				map.get(temp).add(i);
			}
			else
			{
				map.get(temp).add(i);
			}
		}
		int[][] m=new int[quer][3];
		for(int k=0;k<quer;k++)
		{
			m[k][0]=sc.nextInt();
			m[k][1]=sc.nextInt();
			m[k][2]=sc.nextInt();
		}
		for(int i=0;i<quer;i++)
		{
			boolean flag=false;
			int track=0;
			int start=a[m[i][0]-1];
		//	int end=a[m[i][1]-1;
			int contain=m[i][2];
			if(map.get(start).contains(contain))
			{
				System.out.println(track);
			}
			else
			{
				System.out.println("-1");
			}
		}
	}
}
