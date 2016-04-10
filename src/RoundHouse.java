import java.util.*;
public class RoundHouse {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a= sc.nextInt();
	int b = sc.nextInt();
	int temp = (a+b-1)%n;
	if(temp<0)
	{
		temp+=n;
	}
	System.out.println(temp+1);
	
	
	}
}
