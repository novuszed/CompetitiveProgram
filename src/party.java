import java.util.*;
import java.io.*;


public class party {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int numpeople=sc.nextInt();
		GraphAdjacencyList adjlist=new GraphAdjacencyList(numpeople);
		for(int i=1;i<=numpeople;i++)
		{
			int temp=sc.nextInt();
			if(temp==-1)
			{

			}
			else
			{
				
				adjlist.setEdge(i, temp);
			}
		}
		int max=0;
		for(int i=1;i<=numpeople;i++)
		{
			//System.out.println(adjlist.getEdge(i));
			//System.out.println(adjlist.)
		}
		for(int i=1;i<=numpeople;i++)
		{
			
			if(adjlist.countmax(i)>max)
			{
				max=adjlist.countmax(i);
			}
		}
		
		System.out.println(max);
	}
	
}
class GraphAdjacencyList
{
    /* Makes use of Map collection to store the adjacency list for each vertex.*/
    private  Map<Integer, List<Integer>> Adjacency_List;
    /*
     * Initializes the map to with size equal to number of vertices in a graph
     * Maps each vertex to a given List Object
     */
    public GraphAdjacencyList(int number_of_vertices)
    {
        Adjacency_List = new HashMap<Integer, List<Integer>>();
        for (int i = 1 ; i <= number_of_vertices ; i++)
        {
            Adjacency_List.put(i, new LinkedList<Integer>());
        }
    }
    public List<Integer> getEdge(int source)
    {
        if (source > Adjacency_List.size())
        {
            System.out.println("the vertex entered is not present");
            return null;
        }
        return Adjacency_List.get(source);
    }

    /* Adds nodes in the Adjacency list for the corresponding vertex */
    public void setEdge(int source , int destination)
    {
        if (source > Adjacency_List.size() || destination > Adjacency_List.size())
        {
            System.out.println("the vertex entered in not present ");
            return;
        }
        List<Integer> slist = Adjacency_List.get(source);
        slist.add(destination);
      //  List<Integer> dlist = Adjacency_List.get(destination);
      //  dlist.add(source);
    }
    public int countmax(int source)
    {
    	int count=1;
    	while(Adjacency_List.get(source).size()>0)
    	{
    		
    		count+=Adjacency_List.get(source).size();
    		source=Adjacency_List.get(source).get(Adjacency_List.get(source).size()-1);
    		//System.out.println("current count "+count + " Source: "+source);
    	}
    	//System.out.println("count "+count);
    	return count;
    }
}
