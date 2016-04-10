import java.util.*;
public class TheTime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] time = sc.next().split(":");
		int moretime=sc.nextInt();
		//System.out.println(time[0]+" "+time[1]);
		//System.out.println(moretime);
		
		int min= Integer.parseInt(time[1])+moretime;
		int carry=0;
		if(min>60)
		{
			carry=min/60;
			min=min%60;
		}
		int newhour=Integer.parseInt(time[0])+carry;
		if(newhour>=24)
		{
			newhour=newhour%24;
		}
		if(min<10 && newhour<10)
		{
			System.out.println("0"+newhour+":0"+min);

		}
		else if(min<10)
		{
			System.out.println(newhour+":0"+min);

		}
		else if(newhour<10)
		{
			System.out.println("0"+newhour+":"+min);

		}
		else
		{
			System.out.println(newhour+":"+min);
		}
		
	}
}
