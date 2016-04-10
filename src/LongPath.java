import java.math.BigInteger;
import java.util.Scanner;

public class LongPath {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rooms = sc.nextInt();
		BigInteger[] arr= new BigInteger[rooms+2];
		arr[1]=BigInteger.ONE;
		
		BigInteger TWO = BigInteger.valueOf(2);
		for(int k=1; k < arr.length-1;k++)
		{
			int portal2= sc.nextInt();
			arr[k+1]=arr[k].multiply(TWO).add(TWO).subtract(arr[portal2]);
//			arr[k+1]+=2*arr[k]%1000000007;
//			arr[k+1]+=2%1000000007;
//			arr[k+1]-=arr[portal2]%1000000007;
		}
		System.out.println(arr[arr.length-1].subtract(BigInteger.ONE).mod(BigInteger.valueOf(1000000007)));
	}
}
