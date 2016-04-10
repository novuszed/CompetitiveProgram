import java.util.*;
public class ABInterestingStrings {
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		HashMap<Integer,Integer> alpha = new HashMap<Integer,Integer>();
		for(int i=0;i<26;i++)
		{
			alpha.put(i,sc.nextInt());
		}
		//a is 97
		String s = sc.next();
		int sum=0;
		for(int i=0; i<s.length()-1; i++)
		{
			char start = s.charAt(i);
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				
				
			}
		}
		
	}
}
