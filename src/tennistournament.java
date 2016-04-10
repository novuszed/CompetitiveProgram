import java.util.*;
public class tennistournament {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int player=sc.nextInt();
		int bottle=sc.nextInt();
		int towels=sc.nextInt();
		towels=towels * player;
		int sum=0;
		while(player>1)
		{
			sum+=(2*bottle)+1;
			player-=1;
		}
		System.out.println(sum+" "+towels);
	}
}
