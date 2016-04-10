import java.util.*;
public class QualifyingTest {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int teams = sc.nextInt();
		ArrayList<student>[] regions = new ArrayList[teams+1];
		for(int i=0;i<tests;i++)
		{
			String name = sc.next();
			int reg = sc.nextInt();
			int score = sc.nextInt();
			if(regions[reg]==null)
			{
				regions[reg]=new ArrayList<>();
			}
			regions[reg].add(new student(name,reg,score));
		}
		
		for(int i=1;i<=teams;i++)
		{
			if(regions[i]!=null)
			{
				Collections.sort(regions[i], new Comparator<student>()
				{
					@Override
					public int compare(student o1, student o2) {
						// TODO Auto-generated method stub
						return Integer.compare(o2.score,o1.score);
					}
				});
				//regions[i].sort(new Comparator<student>);
			}
		
		}
		for (int i=1;i<=teams;i++)
		{
			student first,second, third;
			first = regions[i].get(0);
			second = regions[i].get(1);
			if(regions[i].size()==2)
			{
				System.out.println(first.name+" "+second.name);
				continue;
			}
			third = regions[i].get(2);
			if(second.score==third.score)
			{
				System.out.println("?");
				
			}
			else
			{
				System.out.println(first.name + " "+second.name);
			}
		}
	
	}

	
	
	static class student
	{
		String name;
		int region,score;
		public student(String name, int region, int score)
		{
			this.name=name;
			this.region=region;
			this.score=score;
		}

		
	}

}
