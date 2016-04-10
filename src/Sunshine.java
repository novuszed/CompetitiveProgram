import java.util.*;
public class Sunshine {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++)
		{
		int words=sc.nextInt();
		ArrayList<String> temp=new ArrayList<String>();
		for(int k=0;k<words;k++)
		{
			temp.add(sc.next());
		}
		if(temp.contains("EXHAUSTED"))
		{
			System.out.println("NO");
		}
		else if(temp.contains("SAD") && temp.contains("CALM"))
		{
			System.out.println("NO");
		}
		else if(temp.contains("SAD") && (!temp.contains("HAPPY")) &&(!temp.contains("ANGRY"))) 
				{
			System.out.println("NO");
				}
		else
		{
			System.out.println("YES");
		}
		
		
		}
		
		}
}
