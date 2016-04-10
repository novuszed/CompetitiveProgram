import java.util.*;
import java.io.*;
public class colonize1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numcases=sc.nextInt();
		while(numcases>0)
		{
		int numrows=sc.nextInt();
		int numcols=sc.nextInt();
		int maxsize=0;
		//System.out.println(numrows+numcols);
		int [][]planet=new int[numrows][numcols];
		
		for(int i=0; i<numrows;i++)
		{
			String temp=sc.next();
			for(int k=0;k<numcols;k++)
			{
				//System.out.println(temp);
				planet[i][k]=Integer.parseInt(String.valueOf(temp.charAt(k)));
			}
		}
	
		for(int a=0;a<planet.length;a++)
		{
			for(int b=0;b<planet[a].length;b++)
			{					
				size=0;
				boolean[][]visited=new boolean [numrows][numcols];
				countSize(planet,a,b,visited);
				if(size > maxsize)
				{
					maxsize=size;
				}
			}
		}
		System.out.println(maxsize);
		numcases--;
		}
		sc.close();
	}
	public static int size=0;
	public static void countSize(int[][]planet, int row, int col,boolean[][]visited)
	{
		int[] dx={-1,0,1,-1,1,-1,0,1};
		int[] dy={-1,-1,-1,0,0,1,1,1};
		
		if(row<0||col<0||row>=planet.length||col>=planet[row].length||visited[row][col]||planet[row][col]==0)
		{
		
		}
		
		else{
			size++;
		visited[row][col]=true;
		for(int i=0;i<8;i++)
		{
			countSize(planet, row+dy[i],col+dx[i],visited);
		}
	}
	}

}
