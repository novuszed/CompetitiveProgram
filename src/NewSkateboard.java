import java.util.*;
public class NewSkateboard {
	public static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ArrayList<String> answer=new ArrayList<String>();
		combination("",input,answer);
		answer.add(input.charAt(input.length()-1)+"");
		for(int i=0;i<answer.size();i++)
		{	
			Long temp1=Long.parseLong(answer.get(i));
			if(temp1%4==0)
			{
				//System.out.println(temp1);
				count++;
			}
		}
		System.out.println(count);
	}
	public static void combination(String prefix, String str, ArrayList<String> answer) {
	    
		int n = str.length();
	    if (n == 0) {
	    	/*
	    	if(!answer.contains(prefix));
	    	{
	    		System.out.println(prefix);
	    		answer.add(prefix);
	    	}
	    	*/
	    	return;//System.out.println(prefix);
	    }

	    else {
		    //System.out.println(prefix+str.charAt(0));
	    	
	    	
		    if(!answer.contains(prefix+str.charAt(0)))
	    	{
	    		//System.out.println(prefix+str.charAt(0));
	    		answer.add(prefix+str.charAt(0));
	    	}
	    	

	        for (int i = 0; i < n; i++)
	            combination(prefix + str.charAt(i), str.substring(i+1, n),answer);
	    }
	    
			//System.out.println(s.charAt(0));
	     
	}
}
