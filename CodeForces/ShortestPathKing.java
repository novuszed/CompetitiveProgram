import java.util.*;
public class ShortestPathKing {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][] board = new int[8][8];
		String start = sc.next();
		String end = sc.next();
		int startX=start.charAt(0)-97;
		int tempX=start.charAt(1)-56;
		int startY=Math.abs(tempX);
		int endX = end.charAt(0)-97;
		int endY = Math.abs(end.charAt(1)-56);
		//start=0,0
		//end= 7,7
		//System.out.println(startX+" "+startY);
		//System.out.println(endX+" "+endY);
		int counter=0;
		ArrayList<String> path = new ArrayList<String>();
		while(endX!=startX || endY!=startY)
		{
			counter++;
			if(endX>startX && endY<startY)
			{
				path.add("RU");
				startX++;
				startY--;
			}
			else if(endX<startX && endY>startY)
			{
				path.add("LD");
				startX--;
				startY++;
			}
			else if(endX>startX && endY>startY)
			{
				path.add("RD");
				startX++;
				startY++;
				//System.out.println("RD");
			}
			else if(endX<startX && endY<startY)
			{
				path.add("LU");
				//System.out.println("LU");
				startX--;
				startY--;
			}
			else if(startX<endX)
			{
				startX++;
				path.add("R");
				//System.out.println("R");
			}
			else if(startX>endX)
			{
				startX--;
				path.add("L");
				//System.out.println("L");
			}
			else if(startY<endY)
			{
				startY++;
				path.add("D");
				//System.out.println("D");
			}
			else
			{
				startY--;
				path.add("U");
				//System.out.println("U");
			}
		}
		System.out.println(counter);
		for(String s: path)
		{
			System.out.println(s);
		}
	}
}
