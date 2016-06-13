import java.util.*;
public class Shopping {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numUser = sc.nextInt();
		int numItem = sc.nextInt();
		int totalItem = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<totalItem;i++)
		{
			arr.add(sc.nextInt());
		}
		for(int i=0;i<numUser;i++)
		{
			
			for(int k=0;k<numItem;k++)
			{
				int temp = sc.nextInt();
				int item = arr.get(temp-1);
				int item2 = arr.get(item-1);
				arr.remove(item-1);
				arr.add(0,item2);
				count+=item;
				//for(Integer s: arr)
				//{
				//	System.out.print(s+" ");
				//}
			//	System.out.println();
			}
		}
		System.out.println(count);
	}
}
