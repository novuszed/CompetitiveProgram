import java.util.*;
public class SerialTime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] map=new char[(k*n)+(k)][m];
		int line=0;
		String tempst="";
		for (int i=0;i<m;i++)
		{
			tempst+="x";
		}
		//System.out.println(tempst);
		for (int i=0;i<k;i++)
		{
			for(int a=0;a<n;a++)
			{
				
				String temp=sc.next();
				map[line++]=temp.toCharArray();
			}
			map[line++]=tempst.toCharArray();
			
		}
		int startx=sc.nextInt()-1;
		int starty=sc.nextInt()-1;
		
		
			for(int j=0;j<n*k+k;j++)
			{
				for(int l=0;l<m;l++)
				{
				//	System.out.println(map[j][l]);
				}
		
			}
			

			boolean[][] visited=new boolean[k*n+k][m];
			Queue<int []> q= new LinkedList<int []>();
			int[]dx={0,0,-1,1,n+1,-1-n};
			int[]dy={-1,1,0,0,0,0};
			int[] start={startx,starty};
			q.add(start);
			visited[startx][starty]=true;
			int count=1;
			while(!q.isEmpty())
			{
				
				int[]curr=q.poll();
				int currx=curr[0];
				int curry=curr[1];
				//System.out.println("Currx and y: "+currx+" "+curry);
				//visited[currx][curry]=true;
				for(int i=0;i<6;i++)
				{
					if(isValid(currx+dx[i],curry+dy[i],k,n,m,map)&&(!visited[currx+dx[i]][curry+dy[i]]))
					{
					
						
				
						count++;
						int newx=currx+dx[i];
						int newy=curry+dy[i];
						int[] temp={newx,newy};
						visited[newx][newy]=true;
						q.add(temp);
					}
					}
				
				}
				
				
			
			System.out.println(count);
			sc.close();
		
	}
	public static boolean isValid(int x, int y, int k, int n, int m,char[][] map)
	{
		if(x<0 || y<0 || x>=k*n+k || y>= m || map[x][y]=='#' ||map[x][y]=='x')
		{
			return false;
		}
		return true;
	}
}
