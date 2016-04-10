import java.util.*;

public class CutRibbon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] ribbons = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
		int[] dp = new int[length + 1];
		Arrays.fill(dp, Integer.MIN_VALUE);

		dp[0]=0;
		for(int i=1;i<dp.length;i++)
		{
			for (int k=0;k<3;k++)
			{
				if(i-ribbons[k] >= 0)
				{
					dp[i]=Math.max(dp[i], 1+dp[i-ribbons[k]]);
				}
			}
		}
		System.out.println(dp[length]);
	}
}
