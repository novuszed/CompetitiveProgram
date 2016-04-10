import java.util.*;
public class lyrics {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> b=new HashMap<String,Integer>();
		int case1=sc.nextInt();
		while(case1>0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int l=sc.nextInt();
			for(int i=0;i<l;i++)
			{
				String[] temp=sc.nextLine().split(" ");
				for(int z=0;z<temp.length;z++)
				{
					b.put(temp[z], 1+b.get(temp[z]));
				}
			}
			for(int i=0;i<b.size();)
			
			
			case1--;
		}
	}
}
