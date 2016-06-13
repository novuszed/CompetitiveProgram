import java.util.*;
public class REgistrationSystem {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<cases;i++)
		{
		String temp = sc.next();
		if(!hm.containsKey(temp))
		{
			System.out.println("OK");
			hm.put(temp, 1);
		}else
		{
			int ith = hm.get(temp);
			System.out.println(temp+ith);
			hm.put(temp,ith+1);
		}
			
		}
	}
}
