import java.util.*;
public class KalevitchChess {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char [][] chess=new char[8][9];
		int counter=0;
		int count=0;
		while(counter<8)
		{
			//System.out.println(sc.next());
			chess[counter++]=sc.next().toCharArray();
		//	System.out.println(counter);
		}
		//System.out.println(chess[0][3]);
		char[] temp =new char[8];
		for(int i=0;i<8;i++)
		{
			temp[i]='W';
		}
		boolean flag=false;
		for(int i=0;i<8;i++)
		{
			flag=false;
			if(chess[i][0]=='B')
			{
				for(int k=1;k<8;k++)
				{
					if(chess[i][k]!='B')
					{
						flag=true;
						break;
					}
				}
				if(!flag)
				{
					//System.out.println("row"+i);
				//chess[i]=temp;
				
					count++;
				}
			}
		}
		//System.out.println(count);
		if(count!=8)
		{
		flag=false;
		for(int k=0;k<8;k++)
		{
			flag=false;
			if(chess[0][k]=='B')
			{
				for(int i=1;i<8;i++)
				{
					if(chess[i][k]!='B')
					{
						flag=true;
						break;
					}
				}
				if(!flag)
				{
				for(int z=0;z<8;z++)
				{
					chess[z][k]='W';
				}
				count++;
				}
			}
		}
		}
		System.out.println(count);
		sc.close();
	}
}
