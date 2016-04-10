import java.util.*;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Scanner;
import java.io.*;
public class AprilFoolsComp1 {

	
	public static void main(String[] args)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int z=0; z<cases;z ++)
		{
			int answer = 0;
			int track=0;
			int emails = sc.nextInt();
			String[] em = new String[emails];
			int del = sc.nextInt();
			for(int i=0;i<emails;i++)
			{
				em[i]=sc.next();
				
			}
			
			for(int k=0;k<emails;k++)
			{
				if(track==del)
				{
					answer++;
					track=0;
				}
				//track=0;
				if(em[k].equals("IMPORTANT"))
				{
					if(track>0)
					{
					answer++;
					}
					track=0;
					continue;
					
				}
				else{
					
					//else
					//{
					track++;
					//}
					
					
				}
				
			}
			//ans.add(answer);
			if(track>0)
			{
				answer++;
			}
			//System.out.println("track"+track);
			System.out.println(answer);
		}
	/*
	for(Integer s: ans)
	{
		System.out.println(s);
	}
	*/
	}
}
	

