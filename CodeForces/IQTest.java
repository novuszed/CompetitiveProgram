import java.util.*;
public class IQTest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int oddInd=1;
		int evenInd=1;
		int oddCount=0;
		int evenCount=0;
		int temp=0;
		for(int i=0;i<num;i++)
		{
			temp = sc .nextInt();
			if(temp%2!=0)
			{
				oddCount++;
				oddInd=i+1;
			}
			else
			{
				evenCount++;
				evenInd=i+1;
			}
		}
		if(oddCount==1)
		{
			System.out.println(oddInd);
		}
		else
		{
			System.out.println(evenInd);
		}
	}
}
