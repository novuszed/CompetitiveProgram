import java.util.*;
import java.math.*;
public class InfiniteSeq {
	public static void main(String[] args )
	{
		Scanner sc=new Scanner(System.in);
		long pos=sc.nextLong();
		long pos1=(long) Math.sqrt(((pos*2)-1));
		long temp=1;
		long next=0;
		while(next<pos)
		{
			next=(temp * (temp+1)/2);
			temp++;
		}
			if(pos==((temp-1)*(temp)/2))
			{
				System.out.println(temp-1);
			}
			else
			{
				System.out.println(pos%((temp-2)*(temp-1)/2));
			}
		
		
		sc.close();
	}
}
