import java.util.*;
import java.io.*;
public class maze1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int height=sc.nextInt();
		int width=sc.nextInt();
		int numwalls=sc.nextInt();
		String[][] picture=new String[height][width];
		int freecellrow=0;
		int freecellcol=0;
		int numfree=0;
		boolean flag=false;
		for(int i=0;i<height;i++)
		{
			String[] temp=sc.next().split("");
			for(int k=0;k<width;k++)
			{
				picture[i][k]=temp[k];
				if(picture[i][k].equals(".") && !flag)
				{
					freecellrow=i;
					freecellcol=k;
					flag=true;
				}
				if(picture[i][k].equals("."))
				{
					numfree++;
				}
			}
		}
		boolean visited[][]=new boolean[height][width];
		//System.out.println(freecellrow+" "+freecellcol+" "+numfree+" "+numwalls);
		dfs(picture,freecellrow,freecellcol,visited,numfree,numwalls);
		for(int i=0;i<height;i++)
		{
			for(int k=0;k<width;k++)
			{
				if(!visited[i][k]&&picture[i][k].equals("."))
				{
					picture[i][k]="X";
				}
			}
		}
		for(int i=0;i<height;i++)
		{
			for(int k=0;k<width;k++)
			{
				System.out.print(picture[i][k]);
			}
			System.out.println();
		}
		sc.close();
	}
	public static int count=0;
	public static void dfs(String[][]picture,int row, int col, boolean[][]visited,int numfree,int numwalls)
	{
		int[]dx={0,0,1,-1};
		int[]dy={-1,1,0,0};
		if(row<0||col<0||row>=picture.length||col>=picture[0].length||((numfree-numwalls)==count)||picture[row][col]=="#"||visited[row][col])
		{
			return;
		}
		else if(picture[row][col].equals(".")&&(numfree-numwalls)!=count)
		{
			count++;
			visited[row][col]=true;
			for(int i=0;i<4;i++)
			{
				dfs(picture,row+dx[i],col+dy[i],visited,numfree,numwalls);
			}
		
		}
	}
}
