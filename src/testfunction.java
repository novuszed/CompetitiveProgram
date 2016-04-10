import java.util.*;
public class testfunction {

	public static void main(String[] args)
	{
		System.out.println(test(7,6));
	}
	public static int test(int n, int k)
	{
		if(k==0 || n==k)
		{
			return 1;
		}
		return test(n-1,k-1)+test(n-1,k);
	}
}
