import java.math.BigInteger;
import java.util.*;
public class ComplicatedGcd {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		BigInteger i1=new BigInteger(input1);
		BigInteger i2=new BigInteger(input2);
		BigInteger i3 = i1.gcd(i2);
		System.out.println(i3);
	}
}
