import java.util.*;
public class SeatingOnBUs {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int people = sc.nextInt();
		int[][]arr = new int[rows][4];
		int bottom = arr.length-1;
		int count=1;
		
		for(int i = bottom; i>=0 && count<=people;i--)
		{			

			arr[i][0]=count++;
			if(count<=people)
			arr[i][3]=count++;

		}
	
		
		for(int i=bottom;i>=0 && count<=people;i--)
		{
			arr[i][1]=count++;
			if(count<=people)
			arr[i][2]=count++;
			
		}
		for(int i=bottom;i>=0;i--)
		{
				if(arr[i][1]!=0)
				{
					System.out.print(arr[i][1]+" ");
				}
				if(arr[i][0]!=0)
				{
					System.out.print(arr[i][0]+" ");

				}
				if(arr[i][2]!=0)
				{
					System.out.print(arr[i][2]+" ");

				}
				if(arr[i][3]!=0)
				{
					System.out.print(arr[i][3]+" ");

				}
			
		}
		
		
		
	}
}
