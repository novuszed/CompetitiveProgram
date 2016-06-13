import java.util.*;

public class MysteriousPresent {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numEnv = sc.nextInt();
		int cardW = sc.nextInt();
	    int cardL = sc.nextInt();
		int envW;
	    int envL;
		int product;
		int envCount=1;
		ArrayList<LinkedList<Integer>> arr = new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<numEnv; i++)
		{
			LinkedList<Integer> link = new LinkedList<Integer>();			
			envW = sc.nextInt();
			envL = sc.nextInt();
			product = envW * envL;
			if(envW > cardW && envL>cardL)
			{
				link.add(envCount);
				link.add(envW);
				link.add(envL);
				link.add(product);
				arr.add(link);
			}
			
			
			envCount++;
		}
		Collections.sort(arr, new Comparator<LinkedList<Integer>>(){
			public int compare(LinkedList<Integer> o1, LinkedList<Integer> o2) {
				return (int) (o1.get(2) - o2.get(2));
				
			}
		});
	for(int i=0;i<numEnv;i++)
	{
		//System.out.println(arr.get(i).get(1)+ " "+arr.get(i).get(2));
	}
		int [] dp = new int[numEnv];
		dp[0]=1;
		int max =1;
		int child =0;
		int maxindex=0;
		int [] prev = new int[numEnv];
		for(int i=1;i<arr.size();i++)
		{
			dp[i]=1;
			for(int j=0;j<i;j++)
			{
				if(arr.get(j).get(1)<arr.get(i).get(1) && arr.get(j).get(2)<arr.get(i).get(2))
				{
					if(dp[j]+1 > dp[i])
					{
						//System.out.println("i"+i);
						//arr.get(i).add(j);
						dp[i]=dp[j]+1;
						maxindex=j;
						prev[i]=maxindex;

					}
				}
				if(max<dp[i])
				{
					max=dp[i];
					//prev[i]=maxindex;
					child=i;
				}
			}
		}
		ArrayList<Integer> st = new ArrayList<Integer>();
		//System.out.println("child"+ child);
		if(arr.size()==0)
		{
			System.out.println(0);
			
		}
		else if(max==1)
		{
			System.out.println(max);

			System.out.println(arr.get(child).get(0));
		}
		else{
			System.out.println(max);

		for(int i=0;i<prev.length;i++)
		{
		//	System.out.println("value: "+arr.get(prev[i]).get(0));
		if(!st.contains(arr.get(prev[i]).get(0)))
			st.add(arr.get(prev[i]).get(0));
		else
		{
			
		
		}
		}
		st.add(arr.get(child).get(0));
		for(int k=0;k<max;k++)
		{
			System.out.print(st.get(k)+" ");
		}
		System.out.println();
		}
	
	}
}
