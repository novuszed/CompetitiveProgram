import java.util.*;
public class GrandMaLauraAndApples {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int price = sc.nextInt();
		Stack<String> st = new Stack<String>();
		for(int i=0;i<people;i++)
		{
			st.push(sc.next());
			
		}
		double apple=0;
		double profit=0;
		while(!st.isEmpty())
		{
			String temp= st.pop();
			if (temp.equals("halfplus"))
			{
				apple=(apple+.5)*2;
				profit+=(apple/2)*price;
			}
			if (temp.equals("half"))
			{
				apple*=2;
				profit+=(apple/2)*price;
			}
		}
		System.out.printf("%.0f",(profit));
	}
}
