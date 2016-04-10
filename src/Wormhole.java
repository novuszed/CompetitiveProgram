import java.util.*;

public class Wormhole {
	
	
	
	static void BellmanFord(ArrayList<LinkedList<Integer>> adjlist,int vertices,int edges)
	{
		int dist[]=new int[vertices+1];
		for(int i=0;i<=vertices;++i)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		dist[1]=0;
		
		for(int i=1;i<vertices;++i)
		{
			for(int j=0;j<edges;++j)
			{
				int u = adjlist.get(j).get(0);
                int v = adjlist.get(j).get(1);
                //System.out.println("source: "+u+" dest: "+v);
                //System.out.println("Before: "+v+" Distance: "+dist[v]);

                int weight = adjlist.get(j).get(2);
                if (dist[u]!=Integer.MAX_VALUE &&
                    dist[u]+weight<dist[v])
                {
                    dist[v]=dist[u]+weight;
                    //System.out.println("source: "+u+" dest: "+v);
                    //System.out.println("New distance: "+dist[v]);
                }
                }
                
		}
		boolean flag=true;
		 for (int j=0; j<edges; ++j)
	        {
			 int u = adjlist.get(j).get(0);
             int v = adjlist.get(j).get(1);
             int weight = adjlist.get(j).get(2);

             if (dist[u]!=Integer.MAX_VALUE &&
	                dist[u]+weight<dist[v])
             {
	              System.out.println("UNSAFE AT ANY SPEED");
	              flag=false;
             }
	        }
		
		for(int i=1;i<dist.length&&flag==true;i++)
		{
			if(dist[i]==Integer.MAX_VALUE)
			{
				System.out.print("OUT ");
			}
			else{
			System.out.print(dist[i]+" ");
			}
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int vertices = sc.nextInt();
			int edges = sc.nextInt();
			ArrayList<LinkedList<Integer>> adj_list = new ArrayList<LinkedList<Integer>>();
			for(int j=0;j<edges;j++)
			{
				adj_list.add(new LinkedList<Integer>());

				for(int l=0;l<3;l++)
				{
					adj_list.get(j).add(sc.nextInt());
				}
				
			}
			
			BellmanFord(adj_list,vertices,edges);
			/*
			for (int k = 0; k<edges; k++) {

				System.out.print(adj_list.get(k).get(0)+" ");
				System.out.print(adj_list.get(k).get(1)+" ");
				System.out.print(adj_list.get(k).get(2));
				System.out.println();

			}
			*/

		}
		sc.close();

	}
	
}
