import java.util.*;
public class Schedule {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int z =0; z <cases;z++)
		{
			int leng = sc.nextInt();
			int schedule = leng*2;
			int[] ans = new int[leng];
			//LinkedList<Integer,Integer> lk = new LinkedList<Integer,Integer>();
			//HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			ArrayList<LinkedList<Integer>> arr = new ArrayList<LinkedList<Integer>>();
			for(int i=0;i<leng;i++)
			{
				LinkedList lk = new LinkedList();
				lk.add(sc.nextInt());
				lk.add(sc.nextInt());
				//hm.put(sc.nextInt(), sc.nextInt());
				arr.add(lk);
				//System.out.println("here?");
				
			}
			Collections.sort(arr, new Comparator<LinkedList<Integer>>(){
				@Override
				public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2)
				{
					return (o1.get(0)+o1.get(1)) - (o2.get(0)+o2.get(1));
				}
			});
			for(int g = 0;g<arr.size();g++)
			{
				//System.out.print(arr.get(g).get(0)+" ");
				//System.out.println(arr.get(g).get(1));

			}
			int max=0;
			ans[0]=1;
			//ans[0]=arr.get(0).get()
			
			for(int k=1;k<leng;k++)
			{
				int counter =1;
				int l = nonCon(arr,k);
				if(l != -1)
				{
					//System.out.println(l);
					counter +=ans[l];
				}
				ans[k] = Math.max(counter, ans[k-1]);
				
			}
			System.out.println(ans[ans.length-1]);
		
		}
	}
	public static int nonCon(ArrayList<LinkedList<Integer>> arr, int i)
	{
		for(int k=i-1;k>=0;k--)
		{
			if(arr.get(k).get(0)+arr.get(k).get(1)  <= arr.get(i).get(0))
			{
				//System.out.println("called: "+arr.get(i).get(0));

				return k;
			}
		}
		return -1;
	}
}
