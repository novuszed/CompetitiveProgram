import java.io.*;
public class MixTape {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long numcases=Long.parseLong(br.readLine());
		
		while(numcases>0)
		{
			String[] strs=br.readLine().trim().split("\\s+");
			String[] strs1=br.readLine().trim().split("\\s+");
			String[] strs2=br.readLine().trim().split("\\s+");
			long numplat=0;
			long ballstatus=0;
			if(strs.length==2)
			{
			numplat=Long.parseLong(strs[0]);
			ballstatus=Long.parseLong(strs[1]);
			}
			long sum=0;
			
			for(int z=0;z<numplat;z++)
			{
				sum+=Long.parseLong(strs1[z])*Long.parseLong(strs2[z]);

			}
			if(sum>=ballstatus)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			numcases--;
		}
	}
}
