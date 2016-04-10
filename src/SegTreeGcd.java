import java.util.*;

public class SegTreeGcd {
	static int st[];

	SegTreeGcd(int arr[], int n) {
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
		int max_size = 2 * (int) Math.pow(2, x) - 1;
		st = new int[max_size];
		constructSTUtil(arr, 0, n - 1, 0);
	}
	static int getGcdUtil(int ss, int se, int qs, int qe, int si)
	{
	     // If segment of this node is a part of given range, then return
        // the sum of the segment
        if (qs <= ss && qe >= se)
            return st[si];
 
        // If segment of this node is outside the given range
        if (se < qs || ss > qe)
            return 0;
 
        // If a part of this segment overlaps with the given range
        int mid = getMid(ss, se);
        return gcd(getGcdUtil(ss, mid, qs, qe, 2 * si + 1),
                getGcdUtil(mid + 1, se, qs, qe, 2 * si + 2));
	}
	static int getGcd(int n, int qs,int qe)
	{
	     // Check for erroneous input values
        if (qs < 0 || qe > n - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getGcdUtil(0, n - 1, qs, qe, 0);
	}
	static int getMid(int s, int e) {
		return s + (e - s) / 2;
	}
	

	int constructSTUtil(int arr[], int ss, int se, int si) {
		if (ss == se) {
			st[si] = arr[ss];
			return arr[ss];
		}
		int mid = getMid(ss, se);
		st[si] = gcd(constructSTUtil(arr, ss, mid, si * 2 + 1),constructSTUtil(arr, mid + 1, se, si * 2 + 2));
		return st[si];
	}

	static int arr[] = new int[1000000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			for (int k = 0; k < N; k++) {
				arr[k] = sc.nextInt();
			}
			int length = arr.length;
			SegTreeGcd tree = new SegTreeGcd(arr, length);
			for(int k=0;k<Q;k++)
			{
				int start = sc.nextInt();
				int end=sc.nextInt();
			System.out.println(getGcd(length, start, end));
			}
			}
		
		sc.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
