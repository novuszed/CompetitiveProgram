import java.util.*;

public class Dijkstra {
	
	 private static List<Vertex> nodes;
	  private static List<Edge> edges;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		ArrayList<Edge>[] temp=new ArrayList[row+1];
		for(int i=1;i<=row;i++)
		{
			temp[i]=new ArrayList<Edge>();
		}
		for (int i=0;i<col;i++)
		{
			sc.nextLine();
			int vert1 = sc.nextInt();
			int vert2 = sc.nextInt();
			int dist = sc.nextInt();

            temp[vert1].add(new Edge(vert2,dist));
            temp[vert2].add(new Edge(vert1,dist));
		}
		
		int[] parents=new int[row+1];
		HashSet<Integer> visited= new HashSet<Integer>();
		PriorityQueue<Vertex>pq=new PriorityQueue<Vertex>();
		Vertex start=new Vertex(1,0,0);
		pq.add(start);
		parents[1]=-1;
		Vertex current=null;
		while(!pq.isEmpty())
		{
			current=pq.remove();
			if(!visited.contains(current.id))
			{
				parents[current.id]=current.previous;
				visited.add(current.id);
			}
			else
				continue;
			for(Edge e: temp[current.id])
			{
				if(!visited.contains(e.id)){
					pq.add(new Vertex(e.id,current.id,current.cost+e.cost));
				}
			}
		}if(parents[row]==0)
			System.out.println(-1);
		else
		{ StringBuilder sb=new StringBuilder();
int backtrackingVertex=row;
Stack<Integer> st=new Stack<Integer>();
st.push(backtrackingVertex);
while(backtrackingVertex !=1)
{
	backtrackingVertex=parents[backtrackingVertex];
	st.push(backtrackingVertex);
}
while(!st.isEmpty()) sb.append(st.pop()+" ");
if(parents[row-1]==-1) System.out.println("-1");
else System.out.print(sb);
		}
	}
	public static class Vertex implements Comparable<Vertex>{
		public int id, previous, cost;
		public Vertex(int a, int prev, int co)
		{
			id=a;
			previous=prev;
			cost=co;
		}
		public int compareTo(Vertex v)
		{
			return cost-v.cost;
		}
	}
	public static class Edge{
		public int id,cost;
		public Edge(int x,int c)
		{
			id=x;
			cost=c;
		}
	}

} 



