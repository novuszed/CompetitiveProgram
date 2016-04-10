import java.util.*;

public class TheatreSquare {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		double x=Math.ceil((double)m/k);
		double y=Math.ceil((double)n/k);
		System.out.println((long)(x*y));
	}
}
