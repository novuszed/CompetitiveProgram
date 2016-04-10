import java.util.*;

public class N_digitsums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int [][] arr = new int[501][4501];
//		Arrays.fill(arr[1], 1);
		for(int i = 0; i < 10; i++) arr[1][i] = 1;
		for (int a = 0; a < cases; a++) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			
			for (int digit = 2; digit < n; digit++) {
				for (int sum = 0; sum < s + 1; sum++) {
					for (int e = 0; e <= Math.min(sum, 9); e++) {
						 
						arr[digit][sum] += arr[digit-1][sum-e];
						arr[digit][sum]=arr[digit][sum]%1000000007;
					}
					
				}

			}
			
			for (int d = 1; d <= Math.min(s,9); d++) {
				arr[n][s] += arr[n - 1][s - d];
				arr[n][s]=arr[n][s]% 1000000007;
			}
			
			System.out.println(arr[n][s]);
			/*
			for(int o=0; o<13;o++)
			{
				for(int p=0;p<35;p++)
				{
					System.out.print(arr[o][p]);
				}
				System.out.println();
			}
			*/
		}
		
	}
}
