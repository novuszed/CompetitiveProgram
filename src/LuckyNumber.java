import java.util.*;
public class LuckyNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ball=sc.nextInt();
		System.out.println((1l << (ball + 1)) - 2);
	}
}
