import java.util.*;
public class ReCount {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc .nextInt();
		
		for(int i=0;i<cases;i++)
		{
			int angie =0;
			int angiecount=0;
			int samcount=0;
			int sam=0;
			HashMap<Integer,Integer> samstate = new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> angiestate = new HashMap<Integer,Integer>();

			int states = sc.nextInt();
			int voters = sc.nextInt();
			int toWin = sc.nextInt();
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int k=0;k<states;k++)
			{
				int state = sc.nextInt();
				int elec = sc .nextInt();
				hm.put(state, elec);
			}
			for(int j=0;j<voters;j++)
			{
				int vote = sc.nextInt();
				String who=sc.next();
				if(who.equals("SAM"))
				{
					if(!samstate.containsKey(vote))
					{
						samstate.put(vote, 1);
					}
					else
					{
						samstate.put(vote,samstate.get(vote)+1);
					}
					samcount++;
					//sam += hm.get(vote);
				}
				else
				{
					if(!angiestate.containsKey(vote))
					{
						angiestate.put(vote, 1);
					}
					else
					{
						angiestate.put(vote,angiestate.get(vote)+1);
					}
					angiecount++;
					//angie+=hm.get(vote);
				}
			}
			for(Integer s: samstate.keySet())
			{
				if(!angiestate.containsKey(s))
				{
					sam+=hm.get(s);
				}
				else if(samstate.get(s)>angiestate.get(s))
				{
					sam+=hm.get(s);
				}
			}
			for(Integer a: angiestate.keySet())
			{
				if(!samstate.containsKey(a))
				{
					angie+=hm.get(a);
				}
			else if(angiestate.get(a)>samstate.get(a))
				{
					angie+=hm.get(a);
				}
			}
			//System.out.println("SAm: "+sam +" ANgie: "+angie);
		//	System.out.println("Samtotal: "+samcount +" angietotal: "+angiecount);
		
			if(sam==angie && samcount==angiecount)
			{
				System.out.println("TIE");
			}
			else if(sam>toWin && angie>toWin)
			{
				if(samcount>angiecount)
				{
					System.out.println("SAM");
				}
				else if (angiecount>samcount)
				{
					System.out.println("ANJIE");
				}
				else if(samcount==angiecount)
				{
					System.out.println("TIE");
				}
			}
			else if(sam>=toWin)
			{
				System.out.println("SAM");
			}
			else if (angie>=toWin)
			{
				System.out.println("ANJIE");
			}
			else
			{
				if(samcount>angiecount)
				{
					System.out.println("SAM");
				}
				else if (angiecount>samcount)
				{
					System.out.println("ANJIE");
				}
				else if(samcount==angiecount)
				{
					System.out.println("TIE");
				}
			}
		}
	}
}
