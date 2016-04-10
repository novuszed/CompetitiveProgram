import java.util.*;

public class WoodCutters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tree = sc.nextInt();
		
		int[] X = new int[tree];
		int[] H = new int[tree];
		
		for (int i = 0; i < tree; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			X[i] = first;
			H[i] = second;
		}
		
		H[0] = H[tree-1] = 0;
		
		for (int i = 1; i < X.length - 1; i++) {

			if (H[i] < X[i] - X[i - 1]) {
				H[i] = 0;
			} else if (H[i] < X[i + 1] - X[i]) {
				X[i] += H[i];
				H[i] = 0;
			}

		}
		int sum = 0;
		for (int i = 0; i < X.length; i++) {
			if (H[i] == 0) {
				sum++;
			}
		}
		System.out.println(sum);

		sc.close();
	}
}
