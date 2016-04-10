import java.util.*;
public class MooresLaw {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		double n=(double)sc.nextInt();
		double x=(double)sc.nextInt();
		x=x * 1.000000011;
		double t=Math.pow(1.000000011,x);
		System.out.println(n*t);
	}
}
