import java.util.*;
public class concert {
	public static int num=0;
	static int[]dx={0,0,1,1,1,-1,-1,-1};
	static int[]dy={-1,1,-1,0,1,-1,0,1};
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int numcases=sc.nextInt();
		for(int i=0;i<numcases;i++)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
			int start=sc.nextInt();
			int starty=sc.nextInt();
			int [][]map=new int[row][col];
			num=0;
			for(int z=0;z<row;z++)
			{
				for(int k=0;k<col;k++)
				{
					map[z][k]=sc.nextInt();
				}
			}
			countSize(map,row,col,start,starty);
			//System.out.println(map+" "+row+" "+col+" "+start+" "+starty);
			System.out.println(num);
			
		}
		sc.close();
	}
	public static void countSize(int[][]planet, int row, int col,int x, int y)
	{

		if(x<0||y<0||x>=planet.length||y>=planet[x].length||planet[x][y]==0)
		{
		
		}
		else{
		//	System.out.println(planet[x][y]);
		num+=planet[x][y];
		planet[x][y]=0;
		for(int i=0;i<8;i++)
		{
			countSize(planet, row,col,x+dy[i],y+dx[i]);
		}
	}
	}
}
