import java.util.*;
public class SimpleStrings {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		st = st.charAt(0)+st+st.charAt(st.length()-1);
		String ans ="";
		char temp='z';
		//System.out.println("st :"+st);
		for(int i=1;i<st.length()-1;i++)
		{
			if(st.charAt(i)==st.charAt(i+1) && st.charAt(i)==st.charAt(i-1))
			{
				for(int k=0;k<st.length()-1;k++)
				{
					if(st.charAt(k)!=st.charAt(i))
					{
						temp=st.charAt(k);
						break;
					}
				}

				ans+=temp;
			}
			else{
			//temp = st.charAt(i);
			ans+=st.charAt(i);
		}
		}
		System.out.println(ans);
	}
}
