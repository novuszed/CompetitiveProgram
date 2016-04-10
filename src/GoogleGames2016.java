import java.util.*;
public class GoogleGames2016 {
	public static void main(String[] args)
	{
		double totalshare = 690000000;
		double start = 10000;
		double purchase=500;
		double sell=700;
		double tries=0;
		double max=0;
		double amountpurchased;
		double ava=0;
		double profit=0;
		while(tries<30)
		{
		ava = Math.floor(start/purchase);
		start-=(ava*purchase);
		start+=(ava*sell);
		profit=ava*sell;
		purchase+=purchase*((ava*purchase)/totalshare);
		purchase=Math.round(purchase*100.0)/100.0;
		start=Math.round(start*100.0)/100.0;
		//System.out.println(purchase);
		//System.out.println(purchase/totalshare);
		System.out.println("profit: "+profit+" Avail Purch: "+ava+" Times: "+tries+" final price: "+purchase+" total: "+start);
		tries++;

		}
		
		}
	
}
