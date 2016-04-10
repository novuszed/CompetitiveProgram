import java.util.*;

public class leastRoundWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < size; k++) {
				arr[i][k] = sc.nextInt();
				if (arr[i][k] == 0) {
					arr[i][k] = 10;
				}
			}
		}
		
		

	}
}
