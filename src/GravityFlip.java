import java.lang.reflect.Array;
import java.util.*;
public class GravityFlip {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int col=sc.nextInt();
		int arr[]=new int[col];
		int index=0;
		while(sc.hasNextInt())
		{
			arr[index]=sc.nextInt();
			index++;
		}
	Arrays.sort(arr);
	for(int i=0; i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	}
}
