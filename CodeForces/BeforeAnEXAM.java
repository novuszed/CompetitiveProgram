import java.util.*;
public class BeforeAnEXAM {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int days = sc .nextInt();
		int totalHours = sc.nextInt();
		int count=0;
		int countb=0;
		int[] arr = new int[days];
		int[] minarr = new int[days];
		for(int i=0;i<days;i++)
		{
			int minS = sc.nextInt();
			int maxS = sc.nextInt();
			//if(count)
			minarr[i]=minS;
			arr[i]=maxS;
			countb+=minS;
			count+=maxS;
		
		}
		if(!(count>=totalHours && totalHours>=countb) )
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
			int diff = totalHours - countb;
			for(int i=0;i<arr.length;i++)
			{
				int calc = arr[i]-minarr[i];
				if(calc <= diff)
				{
					diff-=calc;
					System.out.print(arr[i]);
				}
				else
				{
					
					int hours = minarr[i]+diff;
					System.out.print(hours);
					diff=0;
				}
				System.out.print(' ');
				
				
			}
			
		}
	}
}
