import java.util.*;
public class FarRelativeBirthday {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int count=0;
		String[][]temp=new String[row][row];
		for(int i=0;i<row;i++)
		{
			 temp[i]=sc.next().split("");
			 
		}
		for(int i=0;i<row;i++)
		{
			int cookie=0;

			for(int k=0;k<row;k++)
			{
				if(temp[i][k].equals("C"))
				{
					cookie++;
				}
				//System.out.println(temp[1][i+1]);
			
			}
			if(cookie>2)
			{
				count+=choices(cookie);
			}
			else if(cookie>1)
			{
				count+=1;
			}
			}
		for(int i=0;i<row;i++)
		{
			 int cookie=0;

			for(int k=0;k<row;k++)
			{
				if(temp[k][i].equals("C"))
				{
					cookie++;
				}
				//System.out.println(temp[1][i+1]);
			
			}
			if(cookie>2)
			{
				count+=choices(cookie);
			}
			else if(cookie>1)
			{
				count+=1;
			}
			}
		
		System.out.println(count);
		sc.close();
	}
	public static int choices(int cookie)
	{
		int top=1;
		int nk=1;
		int k=1;
		for(int i=1;i<=cookie;i++)
		{
			top*=i;
		}
		for(int i=1;i<=cookie-2;i++)
		{
			nk*=i;
		}
		return (top/(nk*2));
	}
}
