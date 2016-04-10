import java.util.*;
import java.io.*;
public class Kitayuta {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		int insert=0;
		
		int num=0;
		int front=0;
		int back=word.length()-1;
		if(word.length()==1)
		{
			System.out.println(word+word);
			System.exit(0);
		}
		char f=word.charAt(0);
		char e=word.charAt(word.length()-1);
		if(word.length()>2&&isPalli(word+f))
		{
			System.out.println(word+f);
			System.exit(0);

		}
		//System.out.println(e+word);
		if(word.length()>2&&isPalli(e+word))
		{
			System.out.println(e+word);
			System.exit(0);

		}
		char temp='z';
		
		while(front<word.length()/2)
		{
			if(word.charAt(front)==word.charAt(back))
			{
				front++;
				back--;
			}
			else if((word.charAt(front+1)==word.charAt(back)))
			{
				temp=(word.charAt(front));
				//arr.put(insert++,String.valueOf(word.charAt(front)));
				insert=back+1;
				num++;
				front++;
			}
			else if ((word.charAt(front)==word.charAt(back-1)))
			{
				temp=(word.charAt(back));
				num++;
				insert=front;
				back--;

			}
			else
			{
				
				System.out.println("NA");
				System.exit(0);
			}
			
		}
		
		if(num==0)
		{
			if(word.length()%2==0)
			{
			String ans=word.substring(0,word.length()/2)+"y"+word.substring(word.length()/2);
			System.out.println(ans);
			}
			else
			{
				System.out.println(word.substring(0,word.length()/2)+word.charAt(word.length()/2)+word.substring(word.length()/2));
			}
			}
		else if(num>1)
		{
			System.out.println("NA");
		}
		else
		{
			String ans="";
			if(insert<0)
			{
				ans=temp+word;
			}
			else
			{
			ans=word.substring(0,insert)+temp+word.substring(insert);
			}
			
			System.out.println(ans);
			}
		
	}
	public static boolean isPalli(String word)
	{
		//System.out.println(word);
		Stack st= new Stack();
		for(int i=0;i<word.length()/2;i++)
		{
			st.push(word.charAt(i));
		}
		//System.out.println(st.isEmpty());
		for(int k=word.length()/2;k<word.length();k++)
		{
			//System.out.println(st.peek());
			if (st.isEmpty()||(char)st.pop()!=word.charAt(k))
			{
				//System.out.println("WTF");
				return false;
			}
		}
	
		return true;
		
	
	}
}
